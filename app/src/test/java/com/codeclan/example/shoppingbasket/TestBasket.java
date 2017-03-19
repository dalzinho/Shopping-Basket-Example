package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

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
        Item item = new Item(Shelf.ovenChips());
        basket.addItem(item);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.addItem(new Item(Shelf.ovenChips()));
        basket.addItem(new Item(Shelf.ovenChips()));
        assertEquals(2, basket.countItems());
        basket.empty();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testBasketCanReturnHashMapOfItems(){
        basket.addItem(new Item(Shelf.toy()));
        basket.addItem(new Item(Shelf.ovenChips()));
        basket.addItem(new Item(Shelf.ovenChips()));

        assertTrue(!basket.itemsMap().isEmpty());
        assertEquals(basket.itemsMap().get("AAA002"), Integer.valueOf(2));
    }

}
