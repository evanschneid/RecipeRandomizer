import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Recipes from '../components/Recipes.vue'
//import SingleRecipePage from '../components/SingleRecipePage.vue'
import SingleRecipeDetailsPage from '../components/SingleRecipeDetails.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/recipes',
    name: 'Recipes',
    component: Recipes
  },
  // {
  //   path: '/recipes/:recipeId',
  //   name: 'SingleRecipePage',
  //   component: SingleRecipePage
  // },
  {
    path: '/recipes/:recipeId/details',
    name: 'SingleRecipeDetailsPage',
    component: SingleRecipeDetailsPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
