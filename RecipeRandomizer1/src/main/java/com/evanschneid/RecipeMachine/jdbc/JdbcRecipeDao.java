package com.evanschneid.RecipeMachine.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import com.evanschneid.RecipeMachine.model.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcRecipeDao implements RecipeDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcRecipeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // This method gets a specific recipe from the database
    @Override
    public Recipe getRecipe(int recipeId) {
        Recipe recipe = null;
        String sql = "SELECT recipe_id, recipe_name, food_category_id, recipe_description, total_time " +
                     "FROM recipe " +
                     "WHERE recipe_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, recipeId);
        if(results.next()) {
            recipe = mapToRecipe(results);
        }
        return recipe;
    }

    // This method gets ALL methods from the database and lists them out
    @Override
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipe = new ArrayList<>();
        String sql = "SELECT recipe_id, recipe_name, food_category_id, recipe_description, total_time " +
                     "FROM recipe;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            recipe.add(mapToRecipe(results));
        }
        return recipe;
    }

    // This method gets a specific recipe and all the details for that recipe (Ingredients)
    @Override
    public List<Recipe> getRecipeDetails(int recipeId) {
        List<Recipe> recipe = new ArrayList<>();
        String sql = "SELECT r.recipe_id, r.recipe_name, r.recipe_description, r.food_category_id, fc.food_category_name, total_time, ri.amount, mu.measurement_name, i.ingredient_name " +
                     "FROM recipe r " +
                     "JOIN recipe_ingredient ri ON r.recipe_id = ri.recipe_id " +
                     "JOIN ingredients i ON i.ingredient_id = ri.ingredient_id " +
                     "JOIN food_category fc ON fc.food_category_id = r.food_category_id " +
                     "LEFT OUTER JOIN measurements mu on mu.measurement_id = ri.measurement_id " +
                     "WHERE r.recipe_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, recipeId);
        while(results.next()) {
            recipe.add(mapToRecipeIngredients(results));
        }
        return recipe;
    }

    // This method gets a random recipe from our list of all recipes
    @Override
    public Recipe getRandomRecipe() {
        Recipe recipe = null;

        int min = 1;
        int max = getAllRecipes().size();
        int randomNum = (int)(Math.random() * ( max - min + 1) + min);

        String sql = "SELECT recipe_id, recipe_name, food_category_id, recipe_description, total_time " +
                     "FROM recipe " +
                     "WHERE recipe_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, randomNum);
        if(results.next()) {
            recipe = mapToRecipe(results);
        }
        return recipe;
    }

    // This method lists all recipes in a specific food category
    @Override
    public List<Recipe> getAllRecipesInFoodCategory(int foodCategoryId) {
        List<Recipe> recipes = new ArrayList<>();
        String sql = "SELECT recipe_id, recipe_name, food_category_id, recipe_description, total_time " +
                     "FROM recipe " +
                     "WHERE food_category_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, foodCategoryId);
        while (results.next()) {
            recipes.add(mapToRecipe(results));
        }
        return recipes;
    }

    private Recipe mapToRecipe(SqlRowSet rowSet) {
        Recipe recipe = new Recipe();
        recipe.setRecipeId(rowSet.getInt("recipe_id"));
        recipe.setRecipeName(rowSet.getString("recipe_name"));
        recipe.setFoodCategoryId(rowSet.getInt("food_category_id"));
        recipe.setRecipeDescription(rowSet.getString("recipe_description"));
        recipe.setTotalTime(rowSet.getInt("total_time"));
        return recipe;
    }

    private Recipe mapToRecipeIngredients(SqlRowSet rowSet) {
        Recipe recipe = new Recipe();
        recipe.setRecipeId(rowSet.getInt("recipe_id"));
        recipe.setRecipeName(rowSet.getString("recipe_name"));
        recipe.setFoodCategoryId(rowSet.getInt("food_category_id"));
        recipe.setFoodCategoryName(rowSet.getString("food_category_name"));
        recipe.setTotalTime(rowSet.getInt("total_time"));
        recipe.setAmount(rowSet.getInt("amount"));
        recipe.setMeasurementName(rowSet.getString("measurement_name"));
        recipe.setIngredientName(rowSet.getString("ingredient_name"));
        return recipe;
    }
}
