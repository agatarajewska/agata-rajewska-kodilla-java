package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {

        //Given

        List<Continent> continents = new ArrayList<>();

        Continent contOne = new Continent();
        Continent contTwo = new Continent();
        Continent contThree = new Continent();

        contOne.addCountry(new Country(new BigDecimal("2000")));
        contOne.addCountry(new Country(new BigDecimal("800")));
        contOne.addCountry(new Country(new BigDecimal("5000")));

        contTwo.addCountry(new Country(new BigDecimal("2000")));
        contTwo.addCountry(new Country(new BigDecimal("800")));
        contTwo.addCountry(new Country(new BigDecimal("5000")));

        contThree.addCountry(new Country(new BigDecimal("2000")));
        contThree.addCountry(new Country(new BigDecimal("800")));
        contThree.addCountry(new Country(new BigDecimal("5000")));

        continents.add(contOne);
        continents.add(contTwo);
        continents.add(contThree);

        World world = new World(continents);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then

        Assert.assertEquals(new BigDecimal("23400"), totalPeople);
    }


}
