package com.bootrcamp.demo.Java9_17;

import java.util.stream.IntStream;

public class IfPresentOrElseDemo {

    public static void main(String[] args) {
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>5)
                .findFirst().ifPresentOrElse(
                        (e)-> System.out.println("The value is::"+e),
                        ()->System.out.println("Value does not exists")
                );

        IntStream
                .rangeClosed(1,10)
                .filter(e->e>50)
                .findFirst().orElseThrow();

    }
}
