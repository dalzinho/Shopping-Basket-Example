package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 17/03/2017.
 */

public class Item {

    private String sku;
    private String itemName;
    private float price;

    public Item(String[] item){
        this.sku = item[0];
        this.itemName = item[1];
        this.price = Float.valueOf(item[2]);
    }

    public String getSku() {
        return sku;
    }

    public String getItemName() {
        return itemName;
    }

    public float getPrice() {
        return price;
    }
}
