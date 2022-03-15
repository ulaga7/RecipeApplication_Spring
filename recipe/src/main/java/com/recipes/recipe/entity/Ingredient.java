package com.recipes.recipe.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ingredients")
public class Ingredient implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ingredient_id")
    private int ingredientid;
    @NotNull(message = "The ingredient item should not be null")
    @Size( max = 256, message = "The length of title should not be more than 256 ")
    @Column(name="item")
    private String item;
    @Size( max = 50, message = "The length of title should not be more than 50 ")
    @Column(name="qty")
    private String qty;
    @Size( max = 256, message = "The length of title should not be more than 256 ")
    @Column(name="unit")
    private String unit;
    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientid=" + ingredientid +
                ", item='" + item + '\'' +
                ", qty='" + qty + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    public int getIngredient_id() {
        return ingredientid;
    }

    public void setIngredient_id(int ingredientid) {
        this.ingredientid = ingredientid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}
