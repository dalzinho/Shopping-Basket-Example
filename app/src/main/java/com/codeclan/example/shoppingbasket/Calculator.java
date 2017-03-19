package com.codeclan.example.shoppingbasket;

import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Calculator {

    private Double subTotal;

    public Calculator(){
        this.subTotal = 0.0;
    }

    public void sumBasketItems(Basket basket){
        HashMap<String, Integer> itemsMap = basket.itemsMap();
        for (String sku : itemsMap.keySet()){
            float itemPrice = basket.getPriceBySku(sku);
            int itemQuantity = itemsMap.get(sku);
            if(itemsMap.get(sku) > 1){
                this.subTotal += itemPrice * ((itemQuantity / 2) + (itemQuantity % 2));
            } else {
                this.subTotal += itemPrice;
            }
        }
    }

    public void applyTenPercentDiscount(){
        this.subTotal = this.subTotal * 0.9;
    }

    public void applyTwoPercentDiscount(){
        this.subTotal = this.subTotal * 0.98;
    }

    public Double getFinalTotal(Basket basket){
        sumBasketItems(basket);
        if (this.subTotal >= 20){
            applyTenPercentDiscount();
        }
        if (basket.getCustomer().hasLoyaltyCard()){
            applyTwoPercentDiscount();
        }
        return subTotal;
    }
}
