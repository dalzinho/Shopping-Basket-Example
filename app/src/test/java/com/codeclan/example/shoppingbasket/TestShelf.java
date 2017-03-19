package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/03/2017.
 */

public class TestShelf {
    @Test
    public void testShelfMethodsReturnItemDetails() {
        String[] toy = Shelf.toy();
        assertEquals("AAA001", toy[0]);
    }
}
