package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.RecipeIngredient;

import java.util.List;

public interface RecipeIngredientDao {

    public List<RecipeIngredient> getIngredientDetailsPerRecipe(int recipeId);

    public List<RecipeIngredient> getIngredientDetailsAllRecipes();

}
