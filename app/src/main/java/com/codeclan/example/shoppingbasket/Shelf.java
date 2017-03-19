package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public class Shelf {
    // this 'Shelf' class is intended to simulate a database of products rather than be an end unto itself

    private static String[] item;

    public Shelf(){
        item = new String[3];
    }

    public static String[] toy(){
        item[0] = "AAA001";
        item[1] = "Train Set";
        item[2] = "20";
        return item;
    }
}
