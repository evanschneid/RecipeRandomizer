package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.Recipe;

import java.util.List;

public interface RecipeDao {

    public Recipe getRecipe(int recipeId);

    public List<Recipe> getAllRecipes();

    public Recipe getRecipeDetails(int recipeId);

    public Recipe getRandomRecipe();

    public List<Recipe> getAllRecipesInFoodCategory(int foodCategoryId);
}
