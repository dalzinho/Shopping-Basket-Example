package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 17/03/2017.
 */

public class Item {

    String itemName;
    int price;

    public Item(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
}
