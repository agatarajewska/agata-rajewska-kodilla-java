package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator myCalculator = new Calculator();


        int adding = myCalculator.add(20, 10);
        int substracting = myCalculator.substract(20, 10);

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




