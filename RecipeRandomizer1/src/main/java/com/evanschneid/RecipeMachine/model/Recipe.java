package com.evanschneid.RecipeMachine.model;

public class Recipe {

    private int recipeId;
    private int foodCategoryId;
    private String recipeName;
    private String recipeDescription;
    private int totalTime;

    // These variables are for the recipe ingredients
    private String foodCategoryName;
    private int amount;
    private String measurementName;
    private String ingredientName;

    public Recipe() {}

    public Recipe(int recipeId, int foodCategoryId, String recipeName, String recipeDescription, int totalTime) {
        this.recipeId = recipeId;
        this.foodCategoryId = foodCategoryId;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.totalTime = totalTime;
    }

    public Recipe(int recipeId, int foodCategoryId, String recipeName, String recipeDescription, int totalTime,
                  String foodCategoryName, int amount, String measurementName, String ingredientName) {
        this.recipeId = recipeId;
        this.foodCategoryId = foodCategoryId;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.totalTime = totalTime;
        this.foodCategoryName = foodCategoryName;
        this.amount = amount;
        this.measurementName = measurementName;
        this.ingredientName = ingredientName;
    }

    public int getRecipeId() {
        return recipeId;
    }
    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getFoodCategoryId() {
        return foodCategoryId;
    }
    public void setFoodCategoryId(int foodCategoryId) {
        this.foodCategoryId = foodCategoryId;
    }

    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }
    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public int getTotalTime() {
        return totalTime;
    }
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getFoodCategoryName() {
        return foodCategoryName;
    }
    public void setFoodCategoryName(String foodCategoryName) {
        this.foodCategoryName = foodCategoryName;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMeasurementName() {
        return measurementName;
    }
    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    public String getIngredientName() {
        return ingredientName;
    }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", foodCategoryId=" + foodCategoryId +
                ", recipeName='" + recipeName + '\'' +
                ", recipeDescription='" + recipeDescription + '\'' +
                ", totalTime=" + totalTime +
                '}';
    }
}
