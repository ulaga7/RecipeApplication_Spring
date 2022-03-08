package com.recipes.recipe.service.impl;

import com.recipes.recipe.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryViewForrecipe {

    List<String> cat = new ArrayList<>();

    public void addCategoryName(String name){
        cat.add(name);
    }

    public List<String> getCat() {
        return cat;
    }
}
