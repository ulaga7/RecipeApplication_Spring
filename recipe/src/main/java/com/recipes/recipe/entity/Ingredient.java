package com.recipes.recipe.entity;

import javax.persistence.*;

@Entity
@Table(name="ingredients")
public class Ingredient implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ingredient_id")
    private int ingredientid;

    @Column(name="item")
    private String item;

    @Column(name="qty")
    private String qty;

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
