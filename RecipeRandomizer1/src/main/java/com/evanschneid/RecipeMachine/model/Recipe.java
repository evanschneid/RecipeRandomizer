package com.evanschneid.RecipeMachine.model;

public class Recipe {

    private int recipeId;
    private int foodCategoryId;
    private String recipeName;
    private String recipeDescription;
    private int totalTime;

    public Recipe() {}

    public Recipe(int recipeId, int foodCategoryId, String recipeName, String recipeDescription, int totalTime) {
        this.recipeId = recipeId;
        this.foodCategoryId = foodCategoryId;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.totalTime = totalTime;
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
