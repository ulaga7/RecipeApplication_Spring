package com.recipes.recipe.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private int categoryid;
    @NotNull(message = "The category name should not be null")
    @Size( max = 256, message = "The length of title should not be more than 256 ")
    @Column(name = "category_name")
    private String name;
   @ManyToMany
   @JoinTable(name = "recipe_categories",joinColumns = @JoinColumn(name="category_id"),inverseJoinColumns = @JoinColumn(name = "recipe_id"))
   private Set<RecipeForCategory> recipes;
    public Category(int categoryid, String name) {
        this.categoryid = categoryid;
        this.name = name;
    }

    public Category(){

    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

   public Set<RecipeForCategory> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<RecipeForCategory> recipes) {
        this.recipes = recipes;
    }

    public int getCategory_id() {
        return categoryid;
    }

    public void setCategory_id(int category_id) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryid=" + categoryid +
                ", name='" + name + '\'' +
                '}';
    }

}
