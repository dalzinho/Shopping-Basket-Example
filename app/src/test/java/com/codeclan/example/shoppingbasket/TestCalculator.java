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
    }

    @Test
    public void testCalculatesPriceOfSingleItems(){
        basket.addItem(DAZ);
        assertEquals(5, calc.totalPrice(basket));
    }

    @Test
    public void testBOGOFforSetOfTwo(){
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        assertEquals(5, calc.sumBogofs(basket));
    }

    @Test
    public void testBOGOFforOddQuantities(){
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        assertEquals(15, calc.sumBogofs(basket));
    }

}
