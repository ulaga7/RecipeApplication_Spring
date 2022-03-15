package com.recipes.recipe.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.Positive;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

@Table(name="recipes")
public class Recipe implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recipe_id")
    private int recipeid;
    @NotNull(message = "The title should not be null")
    @Size( max = 256, message = "The length of title should not be more than 256 ")
    @Column(name="title")
    private String title;
    @NotNull(message = "The yield should not be null")
    @Positive(message = "Yield should be a positive number")
    @Column(name="yield")
    private int yield;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "recipe_id")
    private Set<Ingredient> ingredient =new HashSet<>();
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinTable(name = "recipe_categories",joinColumns = @JoinColumn(name="recipe_id"),inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> recipecategories;
    @NotNull(message = "The steps should not be null")
    @Size( max = 2000, message = "The length of steps should not be more than 2000 ")
    @Column(name="steps")
    private String steps;

    public Set<Category> getRecipe_categories() {
        return recipecategories;
    }

    public void setRecipe_categories(Set<Category> recipecategories) {
        this.recipecategories = recipecategories;
    }

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
