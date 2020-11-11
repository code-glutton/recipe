package com.recipe.recipeapp.controllers;

import com.recipe.recipeapp.models.Category;
import com.recipe.recipeapp.models.UnitOfMeasurement;
import com.recipe.recipeapp.repository.CategoryRepo;
import com.recipe.recipeapp.repository.UnitOfMeasurementRepo;
import com.recipe.recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    public final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
