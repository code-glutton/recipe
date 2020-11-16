package com.recipe.recipeapp.service;

import com.recipe.recipeapp.models.Recipe;
import com.recipe.recipeapp.repository.RecipeRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{
    private final RecipeRepo recipeRepo;

    public RecipeServiceImpl(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepo.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepo.findById(l);
        if(!recipeOptional.isPresent()){
            throw new RuntimeException("Recipe not Found");
        }

        return recipeOptional.get();
    }
}
