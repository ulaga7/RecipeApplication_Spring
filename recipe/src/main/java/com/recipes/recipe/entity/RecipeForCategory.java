package com.recipes.recipe.entity;

import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name="recipes")
public class RecipeForCategory implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recipe_id")
    private int recipeid;
    @Column(name="title")
    private String title;
    @Column(name="yield")
    private int yield;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Set<Ingredient> ingredient ;
    @Column(name="steps")
    private String steps;



    @Override
    public String toString() {
        return "Recipe{" +
                "recipeid=" + recipeid +
                ", title='" + title + '\'' +
                ", yield=" + yield +
                ", steps='" + steps + '\'' +
                '}';
    }

    public int getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(int recipeid) {
        this.recipeid = recipeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Set<Ingredient> getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(Set<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }
}
