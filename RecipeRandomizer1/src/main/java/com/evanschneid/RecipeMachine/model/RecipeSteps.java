package com.evanschneid.RecipeMachine.model;

public class RecipeSteps {

    private int recipeStepId;
    private int recipeStepsRecipeId;
    private int recipeStepNumber;
    private String recipeStepDescription;

    public RecipeSteps() {}

    public RecipeSteps(int recipeStepId, int recipeId, int recipeStepNumber, String recipeStepDescription) {
        this.recipeStepId = recipeStepId;
        this.recipeStepsRecipeId = recipeId;
        this.recipeStepNumber = recipeStepNumber;
        this.recipeStepDescription = recipeStepDescription;
    }

    public int getRecipeStepId() {
        return recipeStepId;
    }
    public void setRecipeStepId(int recipeStepId) {
        this.recipeStepId = recipeStepId;
    }

    public int getRecipeStepsRecipeId() {
        return recipeStepsRecipeId;
    }
    public void setRecipeStepsRecipeId(int recipeId) {
        this.recipeStepsRecipeId = recipeId;
    }

    public int getRecipeStepNumber() {
        return recipeStepNumber;
    }
    public void setRecipeStepNumber(int recipeStepNumber) {
        this.recipeStepNumber = recipeStepNumber;
    }

    public String getRecipeStepDescription() {
        return recipeStepDescription;
    }
    public void setRecipeStepDescription(String recipeStepDescription) {
        this.recipeStepDescription = recipeStepDescription;
    }

    @Override
    public String toString() {
        return "RecipeSteps{" +
                "recipeStepId=" + recipeStepId +
                ", recipeStepsRecipeId=" + recipeStepsRecipeId +
                ", recipeStepNumber=" + recipeStepNumber +
                ", recipeStepDescription='" + recipeStepDescription + '\'' +
                '}';
    }
}
