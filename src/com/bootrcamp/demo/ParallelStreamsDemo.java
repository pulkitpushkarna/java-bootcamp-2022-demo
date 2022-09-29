package com.bootrcamp.demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ParallelStreamsDemo {

    public static void main(String[] args) {

        IntStream.rangeClosed(0,50)
                .parallel()
                .forEach(System.out::println);

        System.out.println("--------------");

        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .parallelStream()
                .forEach(System.out::println);


    }
}
