package com.recipes.recipe.service.impl;

import com.recipes.recipe.entity.Recipe;
import com.recipes.recipe.repository.RecipeRepository;
import com.recipes.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("RecipeService")

public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private RecipeRepository recipe_repository ;


    @Override
    public  Iterable<Recipe> getAllRecipes(int page,int limit){
        Pageable paging= PageRequest.of(page, limit);
        Page<Recipe> pagedResult=recipe_repository.findAll(paging);
        return pagedResult.toList();
    }

    /*public  Iterable<Recipe> getAllCategoryForReceipeId(String receipeid){
        return  RecipeRepository.findAll();
    }*/


}
