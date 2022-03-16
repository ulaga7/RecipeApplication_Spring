package com.recipes.recipe.exceptions;

public class RecipesDuplicatesException extends RuntimeException{
    public RecipesDuplicatesException() {
        super(" recipe already exists");
    }
}
