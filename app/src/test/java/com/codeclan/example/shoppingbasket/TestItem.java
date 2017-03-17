package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestItem {

    Item cornflakes;

    @Before
    public void before() {
        cornflakes = new Item("Cornflakes", 5);
    }

    @Test
    public void testItemsHaveNames() {
        assertEquals("Cornflakes", cornflakes.getItemName());
    }

}
