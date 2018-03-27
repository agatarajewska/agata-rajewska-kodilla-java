package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(8, result, 0);
    }
}
