package com.evanschneid.RecipeMachine.model;

public class FoodCategory {

    private int foodCategoryId;
    private String foodCategoryName;

    public FoodCategory() {}

    public FoodCategory(int foodCategory, String foodCategoryName) {
        this.foodCategoryId = foodCategory;
        this.foodCategoryName = foodCategoryName;
    }

    public int getFoodCategoryId() {
        return foodCategoryId;
    }
    public void setFoodCategoryId(int foodCategory) {
        this.foodCategoryId = foodCategory;
    }

    public String getFoodCategoryName() {
        return foodCategoryName;
    }
    public void setFoodCategoryName(String foodCategoryName) {
        this.foodCategoryName = foodCategoryName;
    }

    @Override
    public String toString() {
        return "FoodCategory{" +
                "foodCategoryId=" + foodCategoryId +
                ", foodCategoryName='" + foodCategoryName + '\'' +
                '}';
    }
}

