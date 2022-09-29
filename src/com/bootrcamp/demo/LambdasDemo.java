package com.bootrcamp.demo;


public class LambdasDemo {
    public static void main(String[] args) {

        Operation operation =(int a, int b)-> {
                System.out.println(a+b);
        };

        operation.perform(1,2);
    }
}
