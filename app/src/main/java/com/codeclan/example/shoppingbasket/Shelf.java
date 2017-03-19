package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public class Shelf {
    // this 'Shelf' class is intended to simulate a database of products rather than be an end unto itself

    private static String[] item;

    public static String[] toy(){
        item = new String[3];
        item[0] = "AAA001";
        item[1] = "Train Set";
        item[2] = "20";
        return item;
    }

    public static String[] ovenChips(){
        item = new String[3];
        item[0] = "AAA002";
        item[1] = "Oven Chips";
        item[2] = "2";
        return item;
    }

    public static String[] potNoodle(){
        item = new String[3];
        item[0] = "AAA003";
        item[1] = "Bombay Bad Boy";
        item[2] = "1";
        return item;
    }
}
