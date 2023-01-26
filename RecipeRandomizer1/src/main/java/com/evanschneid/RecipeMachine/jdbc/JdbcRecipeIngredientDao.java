package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.RecipeIngredient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcRecipeIngredientDao implements RecipeIngredientDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRecipeIngredientDao(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    @Override
    public List<RecipeIngredient> getIngredientDetailsPerRecipe(int recipeId) {
        List<RecipeIngredient> recipeIngredient = new ArrayList<>();
        String sql = "SELECT recipe_id, ingredient_id, measurement_id, amount " +
                     "FROM recipe_ingredient " +
                     "WHERE recipe_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, recipeId);
        while (results.next()) {
            recipeIngredient.add(mapToIngredients(results));
        }
        return recipeIngredient;
    }

    @Override
    public List<RecipeIngredient> getIngredientDetailsAllRecipes() {
        return null;
    }

    private RecipeIngredient mapToIngredients(SqlRowSet rowSet) {
        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setRecipeIngredientId(rowSet.getInt("recipe_id"));
        recipeIngredient.setRecipeIngredientIngredientId(rowSet.getInt("ingredient_id"));
        recipeIngredient.setRecipeIngredientMeasurementId(rowSet.getInt("measurement_id"));
        recipeIngredient.setAmount(rowSet.getInt("amount"));
        return recipeIngredient;
    }
}
