package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.shoppingbasket.Item.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestCalculator {

    private Basket basket;
    private Basket otherBasket;
    private Calculator calc;
    private Customer customerHasCard;
    private Customer customerHasNaeCard;
    private String[] ovenChips = {"AAA002", "Oven Chips", "2.0"};
    private String[] toy = {"AAA001", "Train Set", "20."};
    private String[] potNoodle = {"AAA003", "Bombay Bad Boy", "1."};

    @Before
    public void before(){
        calc = new Calculator();
        customerHasCard = new Customer(true);
        customerHasNaeCard = new Customer(false);
        basket = new Basket(customerHasNaeCard);
        otherBasket = new Basket(customerHasCard);
    }

    @Test
    public void testCalculatesPriceOfSingleItems(){
        basket.addItem(new Item(ovenChips));
        assertEquals(2.0, calc.getFinalTotal(basket));
    }

    @Test
    public void testBOGOFforSetOfTwo(){
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        assertEquals(2.0, calc.getFinalTotal(basket));
    }

    @Test
    public void testBOGOFforOddQuantities(){
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));


        assertEquals(6.0, calc.getFinalTotal(basket));
    }

    @Test
    public void test_calculatesTotalAndAppliesTenPercentDiscount(){
        basket.addItem(new Item(toy));
        basket.addItem(new Item(ovenChips));
        basket.addItem(new Item(ovenChips));


        assertEquals(calc.getFinalTotal(basket), 19.8);
    }

    @Test
    public void test_CardCarryingCustomerGetsTwoPercentDiscount(){
        otherBasket.addItem(new Item(potNoodle));
        assertEquals(0.98, calc.getFinalTotal(otherBasket));
    }

    @Test
    public void test_AllThreeDiscountsApply(){
        otherBasket.addItem(new Item(toy));
        otherBasket.addItem(new Item(ovenChips));
        otherBasket.addItem(new Item(ovenChips));

        assertEquals(19.404, calc.getFinalTotal(otherBasket));


    }
}
