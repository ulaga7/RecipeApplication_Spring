package com.recipes.recipe.service.impl;

public class HeadView {

private String title;

    private CategoryViewForrecipe categories;
    private int yield;
    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }
    public CategoryViewForrecipe getCategories() {
        return categories;
    }

    public void setCategories(CategoryViewForrecipe categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
