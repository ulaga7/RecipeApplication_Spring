package com.recipes.recipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.recipes.recipe.entity.Ingredient;
import com.recipes.recipe.entity.Recipe;
import com.recipes.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeApplication {

	@Autowired
	RecipeRepository recipeRepository;
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

}
