package com.codeclan.example.shoppingbasket;

import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Calculator {

    public int sumBasketItems(Basket basket){
        int total = 0;
        HashMap<PriceList, Integer> itemsMap = basket.itemsMap();
        for (PriceList item : itemsMap.keySet()){
            int itemPrice = item.getPrice();
            int itemQuantity = itemsMap.get(item);
            if(itemsMap.get(item) > 1){
                total += itemPrice * ((itemQuantity / 2) + (itemQuantity % 2));
            } else {
                total += itemPrice;
            }
        }
        return total;
    }

    public int tenPercentDiscount(Basket basket){
        int total = sumBasketItems(basket);
        if (total >= 20){
            total = (int) (total * 0.9);
        }
        return total;
    }
}
