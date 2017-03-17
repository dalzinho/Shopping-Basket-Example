package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 17/03/2017.
 */

public enum Item {
    DAZ(5),
    OVENCHIPS(1),
    POTNOODLE(1),
    FAIRYLIQUID(2),
    TOY(20);


    private int price;

    Item(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
