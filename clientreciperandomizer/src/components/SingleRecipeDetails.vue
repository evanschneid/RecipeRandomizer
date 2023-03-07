<template>
    <div>
        <div v-for="recipe in currentRecipe"
        v-bind:key="recipe.recipeId">
            <h1>Testing</h1>
            <h1>{{ recipe.recipeName }}</h1>
            <p>{{ recipe.recipeDescription }}</p>
            <ul>
                <li>{{ recipe.ingredientName }}</li>
            </ul>
        </div>
    </div>
  </template>
  
  <script>
  import RecipeService from '../services/RecipeService.js'

  export default {
    created() {
        const recipeId = this.$route.params.recipeId;
        RecipeService.getSingleRecipeDetails(recipeId).then(response => {
            this.currentRecipe = response.data;
            console.log(response.data);
            console.log(this.currentRecipe.recipeName);
        })
    },
    data() {
        return {
            currentRecipe: [],
        }
    }
}

  </script>
  
  <style>
  </style>