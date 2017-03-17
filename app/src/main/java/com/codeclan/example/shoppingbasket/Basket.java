package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Basket {

    private ArrayList<Item> basketContents;

    public Basket() {
        basketContents = new ArrayList<>();
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

    public HashMap<String, Integer> itemsMap(){
        HashMap<String, Integer> items = new HashMap<>();
        for (Item item : basketContents){
            if (items.containsKey(item.getItemName())){
                int itemCount = items.get(item.getItemName());
                items.put(item.getItemName(), itemCount + 1);
            } else {
                items.put(item.getItemName(), 1);
            }
        }
        return items;
    }
}
