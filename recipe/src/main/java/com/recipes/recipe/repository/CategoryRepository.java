package com.recipes.recipe.repository;

import com.recipes.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Integer>{
    List<Category> findByCategoryid(int categoryid);
}
