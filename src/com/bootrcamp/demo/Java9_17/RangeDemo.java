package com.bootrcamp.demo.Java9_17;

import java.util.stream.IntStream;

public class RangeDemo {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("-----------------------");
        IntStream.rangeClosed(1,10).forEach(System.out::println);

    }
}
