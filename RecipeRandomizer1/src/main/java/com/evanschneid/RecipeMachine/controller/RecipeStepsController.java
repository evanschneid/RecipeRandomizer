package com.evanschneid.RecipeMachine.controller;

import com.evanschneid.RecipeMachine.jdbc.RecipeStepsDao;
import com.evanschneid.RecipeMachine.model.RecipeSteps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class RecipeStepsController {

    @Autowired
    RecipeStepsDao recipeStepsDao;

    @RequestMapping(path = "/all-recipes/{recipeId}/recipe-steps", method = RequestMethod.GET)
    public List<RecipeSteps> retrieveAllRecipeSteps(@PathVariable int recipeId) {
        return recipeStepsDao.getAllRecipeSteps(recipeId);

    }
}
