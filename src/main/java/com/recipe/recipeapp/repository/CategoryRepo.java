package com.recipe.recipeapp.repository;

import com.recipe.recipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long>{
}
