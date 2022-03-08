package com.recipes.recipe.service;

import com.recipes.recipe.entity.Category;
import com.recipes.recipe.service.impl.CategoryView;
import com.recipes.recipe.service.impl.HeadView;
import com.recipes.recipe.service.impl.RecipeView;

public interface RecipeService {

    public Iterable<RecipeView> getAllRecipes(int page, int limit);
    public Iterable<CategoryView> getAllCategories();


}


