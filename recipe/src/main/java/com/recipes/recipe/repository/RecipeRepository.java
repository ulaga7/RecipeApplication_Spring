package com.recipes.recipe.repository;
import com.recipes.recipe.entity.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface RecipeRepository extends PagingAndSortingRepository<Recipe,Integer> {
    @Query("select r from Recipe r where r.title = :#{#req.title}")
    Optional<Recipe> findRecipeDetails(@Param("req") Recipe req);
}
