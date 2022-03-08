package com.recipes.recipe.service.impl;

import com.recipes.recipe.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryView {

    List<String> categories=new ArrayList<>();
    public void addCategoryName(String name){
        categories.add(name);
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;

    }


}
