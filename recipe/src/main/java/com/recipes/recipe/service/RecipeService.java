package com.recipes.recipe.service;

import com.recipes.recipe.entity.Recipe;

public interface RecipeService {

    public Iterable<Recipe> getAllRecipes(int page,int limit);

}


