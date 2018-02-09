package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator myCalculator = new Calculator(20, 10);

        int adding = myCalculator.add();
        int substracting = myCalculator.substract();

        if (adding == 30) {
            System.out.println("adding test is ok");
        } else {
            System.out.println("Error!");
        }

        if (substracting == 10) {
            System.out.println("substracting test is ok");
        } else {
            System.out.println("Error!");

        }
    }


}




