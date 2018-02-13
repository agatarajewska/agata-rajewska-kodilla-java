package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.*;
import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Beginning test:");
    }

    @After
    public void after() {
        System.out.println("End test." + "\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        OddNumbersExterminator checkEmptyList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = checkEmptyList.exterminate(emptyList);
        System.out.println(emptyList);
        //Then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        evenNumbers.add(2);
        evenNumbers.add(22);
        evenNumbers.add(10);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        oddNumbers.add(13);
        oddNumbers.add(22);
        oddNumbers.add(100);
        oddNumbers.add(14);
        oddNumbers.add(17);
        oddNumbers.add(8);
        oddNumbers.add(3);

        OddNumbersExterminator checkEvenList = new OddNumbersExterminator();

        ArrayList<Integer> result1 = checkEvenList.exterminate(evenNumbers);
        System.out.println("Testing ArrayList with even numbers: " + result1 + "\n");
        Assert.assertEquals(7, result1.size());

        ArrayList<Integer> result2 = checkEvenList.exterminate(oddNumbers);
        System.out.println("Testing ArrayList with odd numbers: " + result2);
        Assert.assertEquals(4, result2.size());
    }
}


