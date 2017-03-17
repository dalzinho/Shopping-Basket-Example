package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.shoppingbasket.PriceList.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestCalculator {

    Basket basket;
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
        basket = new Basket();
        basket.addItem(DAZ);
    }

    @Test
    public void testCalculatesPriceOfSingleItems(){
        assertEquals(5, calc.totalPrice(basket));
    }

//    @Test
//    public void test

}
