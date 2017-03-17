package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static com.codeclan.example.shoppingbasket.PriceList.*;
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
    private Customer customer;

    @Before
    public void before(){

        customer = new Customer(true);
        basket = new Basket(customer);

    }

    @Test
    public void testCanCountItems(){
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCanAddItemToBasket(){
        basket.addItem(DAZ);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.addItem(FAIRYLIQUID);
        basket.addItem(FAIRYLIQUID);
        basket.empty();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testBasketCanReturnHashMapOfItems(){
        basket.addItem(FAIRYLIQUID);
        basket.addItem(OVENCHIPS);
        basket.addItem(OVENCHIPS);

        assertTrue(!basket.itemsMap().isEmpty());
        assertEquals(basket.itemsMap().get(OVENCHIPS), Integer.valueOf(2));
    }

}
