package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = {10,10,10,20,10,15};
        double result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(12.5, result, 0);
    }

}
