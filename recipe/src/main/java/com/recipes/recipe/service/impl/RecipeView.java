package com.recipes.recipe.service.impl;

public class RecipeView {
    HeadView head;
StepView directions;
IngredientView ingredients;


    public StepView getDirections() {
        return directions;
    }

    public void setDirections(StepView directions) {
        this.directions = directions;
    }



    public HeadView getHead() {
        return head;
    }

    public void setHead(HeadView head) {
        this.head = head;
    }

    public IngredientView getIngredients() {
        return ingredients;
    }

    public void setIngredients(IngredientView ingredients) {
        this.ingredients = ingredients;
    }
}
