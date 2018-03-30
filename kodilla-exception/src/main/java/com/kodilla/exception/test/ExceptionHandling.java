package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(5.0, 10.0);
        }catch(Exception e){
            System.out.println("Złapałam wyjątek! "+e);
        }finally {
            System.out.println("Wykonuję się po wszystkim.");
        }

    }

}
