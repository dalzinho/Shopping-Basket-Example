package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Basket {

    private ArrayList<PriceList> basketContents;

    public Basket() {
        basketContents = new ArrayList<>();
    }

    public ArrayList<PriceList> getBasketContents() {
        return basketContents;
    }

    public int countItems() {
        return basketContents.size();
    }

    public void addItem(PriceList item) {
        basketContents.add(item);
    }


    public void empty() {
        basketContents.clear();
    }

    public HashMap<PriceList, Integer> itemsMap(){
        HashMap<PriceList, Integer> items = new HashMap<>();
        for (PriceList item : basketContents){
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
