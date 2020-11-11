package com.recipe.recipeapp.service;

import com.recipe.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
