package com.evanschneid.RecipeMachine.controller;

import com.evanschneid.RecipeMachine.jdbc.FoodCategoryDao;
import com.evanschneid.RecipeMachine.model.FoodCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodCategoryController {

    @Autowired
    FoodCategoryDao foodCategoryDao;

    @RequestMapping(path = "/food-categories", method = RequestMethod.GET)
    public List<FoodCategory> retrieveAllFoodCategories() {
        return foodCategoryDao.getAllFoodCategories();
    }
}
