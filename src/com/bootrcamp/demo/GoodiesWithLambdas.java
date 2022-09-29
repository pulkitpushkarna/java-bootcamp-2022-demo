package com.bootrcamp.demo;

interface MyFunctionalInterface{

    int returnValue(int number);
}


public class GoodiesWithLambdas {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface =  number -> number*number;

        System.out.println(myFunctionalInterface.returnValue(5));;

    }
}
