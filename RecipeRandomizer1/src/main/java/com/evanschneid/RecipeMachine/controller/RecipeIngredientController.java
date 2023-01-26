package com.evanschneid.RecipeMachine.controller;

import com.evanschneid.RecipeMachine.jdbc.RecipeIngredientDao;
import com.evanschneid.RecipeMachine.model.RecipeIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeIngredientController {

    @Autowired
    RecipeIngredientDao recipeIngredientDao;

/*    @RequestMapping(path = "/all-recipes/{recipeId}/details", method = RequestMethod.GET)
    public List<RecipeIngredient> getRecipeIngredientForSingleRecipe(@PathVariable int recipeId) {
        return recipeIngredientDao.getIngredientDetailsPerRecipe(recipeId);

    }*/
}
