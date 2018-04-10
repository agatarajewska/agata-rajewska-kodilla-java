package com.kodilla.patterns.strategy.social;


import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {


    @Test
    public void testDefaultSharingStrategies(){
        //Given

        User ania = new Millenials("Ania");
        User michal = new YGeneration("Michał");
        User marcin = new ZGeneration("Marcin");

        //When
        String aniaShouldShareOn = ania.sharePost();
        String michalShouldShareOn = michal.sharePost();
        String marcinShouldShareOn = marcin.sharePost();

        //Then

        Assert.assertEquals("Facebook", aniaShouldShareOn);
        Assert.assertEquals("Twitter", michalShouldShareOn);
        Assert.assertEquals("Snapchat", marcinShouldShareOn);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When

        String stevenShouldShareOn = steven.sharePost();
        steven.setSocialPublisher(new TwitterPublisher());
        stevenShouldShareOn = steven.sharePost();

        //Then
        Assert.assertEquals("Twitter", stevenShouldShareOn);
    }

}
