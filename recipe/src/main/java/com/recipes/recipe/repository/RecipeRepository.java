package com.recipes.recipe.repository;
import com.recipes.recipe.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface RecipeRepository extends PagingAndSortingRepository<Recipe,Integer> {

}
