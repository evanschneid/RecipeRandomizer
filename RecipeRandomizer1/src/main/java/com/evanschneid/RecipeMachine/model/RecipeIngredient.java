package com.evanschneid.RecipeMachine.model;

public class RecipeIngredient {

    private int recipeIngredientId;
    private int recipeIngredientIngredientId;
    private int recipeIngredientMeasurementId;
    private int amount;

    public RecipeIngredient() {}

    public RecipeIngredient(int recipeIngredientId, int recipeIngredientIngredientId, int recipeIngredientMeasurementId, int amount) {
        this.recipeIngredientId = recipeIngredientId;
        this.recipeIngredientIngredientId = recipeIngredientIngredientId;
        this.recipeIngredientMeasurementId = recipeIngredientMeasurementId;
        this.amount = amount;
    }

    public int getRecipeIngredientId() {
        return recipeIngredientId;
    }
    public void setRecipeIngredientId(int recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public int getRecipeIngredientIngredientId() {
        return recipeIngredientIngredientId;
    }
    public void setRecipeIngredientIngredientId(int recipeIngredientIngredientId) {
        this.recipeIngredientIngredientId = recipeIngredientIngredientId;
    }

    public int getRecipeIngredientMeasurementId() {
        return recipeIngredientMeasurementId;
    }
    public void setRecipeIngredientMeasurementId(int recipeIngredientMeasurementId) {
        this.recipeIngredientMeasurementId = recipeIngredientMeasurementId;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "recipeIngredientId=" + recipeIngredientId +
                ", recipeIngredientIngredientId=" + recipeIngredientIngredientId +
                ", recipeIngredientMeasurementId=" + recipeIngredientMeasurementId +
                ", amount=" + amount +
                '}';
    }
}

