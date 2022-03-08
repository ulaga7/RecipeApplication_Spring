package com.recipes.recipe.controller;

import com.recipes.recipe.exceptions.RecipesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RecipeServiceErrorAdvice
{
    @ExceptionHandler({RecipesNotFoundException.class})
    public ResponseEntity<String> handleRunTimeException(RecipesNotFoundException e) {
        return error(HttpStatus.NO_CONTENT, e.getMessage());
    }



    private ResponseEntity<String> error(HttpStatus status, String e) {
        return ResponseEntity.status(status).body(e);
    }
}
