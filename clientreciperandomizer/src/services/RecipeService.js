import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default { 

getAllRecipes() {
  return http.get(`/all-recipes`);
},

getSingleRecipe(recipeId) {
  return http.get(`/all-recipes/${recipeId}`);
},

getSingleRecipeDetails(recipeId) {
  return http.get(`/all-recipes/${recipeId}/details`);
},

getRandomRecipe() {
  return http.get(`/random-recipe`);
}

}
