package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Basket {

    private ArrayList<Item> basketContents;
    private Customer customer;

    public Basket(Customer customer) {
        this.basketContents = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getBasketContents() {
        return basketContents;
    }

    public int countItems() {
        return basketContents.size();
    }

    public void addItem(Item item) {
        basketContents.add(item);
    }


    public void empty() {
        basketContents.clear();
    }

    public HashMap<Item, Integer> itemsMap(){
        HashMap<Item, Integer> items = new HashMap<>();
        for (Item item : basketContents){
            if (items.containsKey(item)){
                int itemCount = items.get(item);
                items.put(item, itemCount + 1);
            } else {
                items.put(item, 1);
            }
        }
        return items;
    }
}
