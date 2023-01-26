<template>
  <div>
      <h1>Hello!</h1>
        <div class="recipe-box" v-for="recipe in allRecipes" v-bind:key="recipe.recipeId"> {{ recipe.recipeName }}
          <p>{{ recipe.recipeDescription }}</p>
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
.recipe-box {
    background-color: aqua;
    margin: 10px;
}
</style>