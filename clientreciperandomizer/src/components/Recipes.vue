<template>
  <div>
      <h1>Hello!</h1>
        <div class="recipe-container"> 
        <router-link
        v-for="recipe in allRecipes"
        :key="recipe.recipeId"
        :to="{ name: 'SingleRecipePage', params: { recipeId: recipe.recipeId } }">
        <!-- <router-link v-bind:to="{name: 'SingleRecipePage', params: {recipeId: recipe.recipeId}}" v-for="recipe in allRecipes" v-bind:key="recipe.recipeId"> -->
            <div>
                <h2>{{ recipe.recipeName }}</h2>
                <p>{{ recipe.recipeDescription }}</p>
            </div>
        </router-link>
        </div>
        {{allRecipes}}
  </div>
</template>

<script>
import RecipeService from '../services/RecipeService.js'

export default {
    created() {
        RecipeService.getAllRecipes().then(response => {
            this.allRecipes = response.data;
        })
    },
    data() {
        return {
            allRecipes: []
        }
    }
}
</script>

<style>
.recipe-container {
    background-color: aqua;
    margin: 10px;
    border: 10px solid black;
}
</style>