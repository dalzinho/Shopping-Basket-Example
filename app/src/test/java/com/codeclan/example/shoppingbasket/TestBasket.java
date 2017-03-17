package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 17/03/2017.
 */

public class TestBasket {

    private Basket basket;
    private Item washingUpLiquid;
    private Item ovenChips;
    private Item moreOvenChips;

    @Before
    public void before(){
        basket = new Basket();
        washingUpLiquid = new Item("Fairy Liquid", 2);
        ovenChips = new Item("Oven Chips", 2);
        moreOvenChips = new Item("Oven Chips", 2);
    }

    @Test
    public void testCanCountItems(){
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCanAddItemToBasket(){
        basket.addItem(washingUpLiquid);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.addItem(washingUpLiquid);
        basket.addItem(washingUpLiquid);
        basket.empty();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testBasketCanReturnHashMapOfItems(){
        basket.addItem(washingUpLiquid);
        basket.addItem(ovenChips);
        basket.addItem(moreOvenChips);

        assertTrue(!basket.itemsMap().isEmpty());
        assertEquals(basket.itemsMap().get("Oven Chips"), Integer.valueOf(2));
    }

}
