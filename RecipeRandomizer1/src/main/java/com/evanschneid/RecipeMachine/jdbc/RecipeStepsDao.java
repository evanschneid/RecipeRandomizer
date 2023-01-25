package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.RecipeSteps;

import java.util.List;

public interface RecipeStepsDao {

    public List<RecipeSteps> getAllRecipeSteps(int recipeId);

}
