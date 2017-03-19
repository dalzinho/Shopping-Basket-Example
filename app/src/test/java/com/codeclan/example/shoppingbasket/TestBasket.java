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
    private String[] ovenChips = {"AAA002", "Oven Chips", "2.0"};
    private String[] toy = {"AAA001", "Train Set", "20."};

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
        basket.addItem(new Item(ovenChips));
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanRemoveLastItemFromBasket(){
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.removeLastItem();
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanRemoveOneItemBySKU(){
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.removeOneBySKU("AAA002");
        assertEquals(2, basket.countItems());
    }

    @Test
    public void test

    @Test
    public void testCanEmptyBasket(){
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        assertEquals(2, basket.countItems());
        basket.empty();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testBasketCanReturnHashMapOfItems(){
        basket.addItem(new Item(toy));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));

        assertTrue(!basket.itemsMap().isEmpty());
        assertEquals(basket.itemsMap().get("AAA002"), Integer.valueOf(2));
    }

}
