package com.evanschneid.RecipeMachine.controller;

import com.evanschneid.RecipeMachine.jdbc.RecipeDao;
import com.evanschneid.RecipeMachine.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeDao recipeDao;

    @RequestMapping(path= "/all-recipes", method = RequestMethod.GET)
    public List<Recipe> retrieveAllRecipes() {
        return recipeDao.getAllRecipes();
    }

    @RequestMapping(path = "/all-recipes/{recipeId}", method = RequestMethod.GET)
    public Recipe getSingleRecipe(@PathVariable int recipeId) {
        Recipe recipe = recipeDao.getRecipe(recipeId);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found");
        } else {
            return recipe;
        }
    }

    @RequestMapping(path = "/all-recipes/{recipeId}/details", method = RequestMethod.GET)
    public Recipe getSingleRecipeDetails(@PathVariable int recipeId) {
        Recipe recipe = recipeDao.getRecipeDetails(recipeId);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found");
        } else {
            return recipe;
        }
    }

    @RequestMapping(path = "/random-recipe", method = RequestMethod.GET)
    public Recipe getRandomRecipe() {
        Recipe recipe = recipeDao.getRandomRecipe();
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found");
        } else {
            return recipe;
        }
    }

    @RequestMapping(path= "/food-categories/{foodCategoryId}", method = RequestMethod.GET)
    public List<Recipe> retrieveAllRecipesInFoodCategory(@PathVariable int foodCategoryId) {
        return recipeDao.getAllRecipesInFoodCategory(foodCategoryId);
    }

}
