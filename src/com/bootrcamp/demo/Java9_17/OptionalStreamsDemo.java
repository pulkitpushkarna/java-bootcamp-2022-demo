package com.bootrcamp.demo.Java9_17;

import java.util.stream.IntStream;

public class OptionalStreamsDemo {

    public static void main(String[] args) {
        IntStream.range(1,9)
                .filter(e->e>5)
                .findFirst()
                .stream()
                .mapMulti((number,consumer)->

                        IntStream.rangeClosed(1,10)
                                .forEach(e-> consumer.accept(number*e))
                ).forEach(System.out::println);


    }
}
