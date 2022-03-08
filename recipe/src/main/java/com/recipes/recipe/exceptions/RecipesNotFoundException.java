package com.recipes.recipe.exceptions;

public class RecipesNotFoundException extends RuntimeException{
    public RecipesNotFoundException() {
        super("No recipe found!");
    }
}
