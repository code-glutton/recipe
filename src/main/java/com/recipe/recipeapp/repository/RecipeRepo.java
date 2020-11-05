package com.recipe.recipeapp.repository;

import com.recipe.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
