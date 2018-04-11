package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){

        //Given

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(2)
                .sauce("hot")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("garlic")
                .ingredient("cheese")
                .build();

        System.out.println(bigmac);

        //When

        String roll = bigmac.getRoll();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then

        Assert.assertEquals("sesame", roll);
        Assert.assertEquals(2, burgers);
        Assert.assertEquals("hot", sauce);
        Assert.assertEquals(4, howManyIngredients);

    }

}
