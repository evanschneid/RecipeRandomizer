<template>
    <div>
        <h1>{{ recipe.recipeName }}</h1>
        <p>{{ recipe.recipeDescription }}</p>
        <ul>

        </ul>
    </div>
  </template>
  
  <script>
  import RecipeService from '../services/RecipeService.js'

  export default {
    created() {
        const recipeId = this.$route.params.recipeId;
        RecipeService.getSingleRecipeDetails(recipeId).then(response => {
        this.recipe = response.data;
        })
    },
    data() {
        return {
        recipe: {}
        }
    }
}

  </script>
  
  <style>
  </style>