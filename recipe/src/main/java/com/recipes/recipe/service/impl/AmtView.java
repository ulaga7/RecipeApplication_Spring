package com.recipes.recipe.service.impl;

public class AmtView {
    QtyView amt;
    private String items;

    public QtyView getAmt() {
        return amt;
    }

    public void setAmt(QtyView amt) {
        this.amt = amt;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
