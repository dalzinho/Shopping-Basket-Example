package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.shoppingbasket.Item.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 17/03/2017.
 */

public class TestBasket {

    private Basket basket;
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
