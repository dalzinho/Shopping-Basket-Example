package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.shoppingbasket.PriceList.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestCalculator {

    private Basket basket;
    private Calculator calc;
    private Customer customerHasCard;
    private Customer customerHasNaeCard;

    @Before
    public void before(){
        calc = new Calculator();
        customerHasCard = new Customer(true);
        customerHasNaeCard = new Customer(false);
        basket = new Basket(customerHasNaeCard);
    }

    @Test
    public void testCalculatesPriceOfSingleItems(){
        basket.addItem(DAZ);
        assertEquals(5.0, calc.getFinalTotal(basket));
    }

    @Test
    public void testBOGOFforSetOfTwo(){
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        assertEquals(5.0, calc.getFinalTotal(basket));
    }

    @Test
    public void testBOGOFforOddQuantities(){
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        assertEquals(15.0, calc.getFinalTotal(basket));
    }

    @Test
    public void test_calculatesTotalAndAppliesTenPercentDiscount(){
        basket.addItem(TOY);
        basket.addItem(DAZ);
        basket.addItem(DAZ);
        assertEquals(calc.getFinalTotal(basket), 22.5);
    }

    @Test
    public void test_CardCarryingCustomerGetsTwoPercentDiscount(){
        Basket otherBasket = new Basket(customerHasCard);
        otherBasket.addItem(POTNOODLE);
        assertEquals(0.98, calc.getFinalTotal(otherBasket));
    }

    @Test
    public void test_AllThreeDiscountsApply(){
        Basket otherBasket = new Basket(customerHasCard);
        otherBasket.addItem(TOY);
        otherBasket.addItem(DAZ);
        otherBasket.addItem(DAZ);
        assertEquals(22.05, calc.getFinalTotal(otherBasket));


    }
}
