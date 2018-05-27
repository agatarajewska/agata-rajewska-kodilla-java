package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Making pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Making pizza with tomato sauce and cheese + extra cheese", description);
    }

    @Test
    public void testExtraCheeseAndSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testExtraCheeseAndSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Making pizza with tomato sauce and cheese + extra cheese + salami", description);
    }

    @Test
    public void testAllInGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
        theOrder = new TomatoPizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testAllInGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
        theOrder = new TomatoPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Making pizza with tomato sauce and cheese + extra cheese + salami + ham + tomato", description);
    }
}

