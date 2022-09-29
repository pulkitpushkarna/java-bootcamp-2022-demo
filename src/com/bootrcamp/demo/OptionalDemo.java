package com.bootrcamp.demo;

import java.util.Arrays;

public class OptionalDemo {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(35,87)
                .stream()
                .filter(e->e%2==0)
                .findFirst().orElse(-1));


        System.out.println(Arrays.asList(35,87)
                .stream()
                .filter(e->e%2==0)
                .findFirst().orElseGet(()->{
                    ///Configuration environment
                    return -234;
                }));
    }


}
