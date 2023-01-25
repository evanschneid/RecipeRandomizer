package com.evanschneid.RecipeMachine.model;

public class Ingredients {

    private int ingredientId;
    private String ingredientName;

    public Ingredients() {}

    public Ingredients(int ingredientId, String ingredientName) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
    }

    public int getIngredientId() {
        return ingredientId;
    }
    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredientId=" + ingredientId +
                ", ingredientName='" + ingredientName + '\'' +
                '}';
    }
}

