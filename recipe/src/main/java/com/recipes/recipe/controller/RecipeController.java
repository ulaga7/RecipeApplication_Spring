package com.recipes.recipe.controller;

import com.recipes.recipe.entity.Category;
import com.recipes.recipe.exceptions.RecipesNotFoundException;
import com.recipes.recipe.repository.CategoryRepository;
import com.recipes.recipe.service.RecipeService;
import com.recipes.recipe.service.impl.CategoryView;
import com.recipes.recipe.service.impl.HeadView;
import com.recipes.recipe.service.impl.RecipeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/services/recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipe_service;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/all")
    public ResponseEntity<List<RecipeView>> getAllRecipes(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "limit", defaultValue = "1") int limit) throws RecipesNotFoundException {

        List<RecipeView> recipesList = new ArrayList<>();


            for (RecipeView recipe : recipe_service.getAllRecipes(page, limit)
            ) {
                recipesList.add(recipe);

            }



        return new ResponseEntity<List<RecipeView>>(recipesList, HttpStatus.OK);

    }

    @GetMapping("/filters/categories")
    public ResponseEntity<List<CategoryView>> getAllCategories(){
        List<CategoryView> categoryList = new ArrayList<>();


            for (CategoryView category : recipe_service.getAllCategories()
            ) {
                categoryList.add(category);

            }


        return new ResponseEntity<List<CategoryView>>(categoryList, HttpStatus.OK);

    }
    @GetMapping("/recipes")
    public ResponseEntity<List<Category>> getRecipeByCategory(@RequestParam int categoryid){
        return new ResponseEntity<List<Category>>(categoryRepository.findByCategoryid(categoryid),HttpStatus.OK);
    }

}
