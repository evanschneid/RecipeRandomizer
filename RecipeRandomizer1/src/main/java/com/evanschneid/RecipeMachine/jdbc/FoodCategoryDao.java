package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.FoodCategory;

import java.util.List;

public interface FoodCategoryDao {

    public List<FoodCategory> getAllFoodCategories();

}
