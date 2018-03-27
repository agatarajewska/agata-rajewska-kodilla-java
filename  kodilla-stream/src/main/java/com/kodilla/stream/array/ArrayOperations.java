package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;


public interface ArrayOperations {

    public static double getAverage(int[] numbers){

        IntStream.range(1,numbers.length+1)
                .forEach(n -> System.out.println(n));

        OptionalDouble total = IntStream.range(1,numbers.length+1)
                .average();

        return total.getAsDouble();
    }
}
