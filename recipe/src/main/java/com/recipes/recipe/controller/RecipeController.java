package com.recipes.recipe.controller;

import com.recipes.recipe.entity.Recipe;
import com.recipes.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/services/recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipe_service;
    @GetMapping("/all")
    public ResponseEntity<List<Recipe>> getAllRecipes(@RequestParam(value = "page",defaultValue = "0") int page, @RequestParam(value = "limit",defaultValue = "1") int limit){
        List<Recipe> recipesList= new ArrayList<>();
        try{

            for (Recipe recipe:recipe_service.getAllRecipes( page, limit)
                 ) {
                recipesList.add(recipe);

            }

        }
        catch (Exception ex){

            System.out.println("Error");
            ex.getMessage();
        }
        return new ResponseEntity<List<Recipe>>(recipesList,HttpStatus.OK);

    }


}
