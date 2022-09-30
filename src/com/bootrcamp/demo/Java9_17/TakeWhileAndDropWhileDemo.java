package com.bootrcamp.demo.Java9_17;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeWhileAndDropWhileDemo {

    public static void main(String[] args) {



        System.out.println(IntStream
                .rangeClosed(1,10)
                .takeWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));


        System.out.println(IntStream
                .rangeClosed(1,10)
                .dropWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));


        System.out.println(Arrays.asList(10,9,8,7,6,5,4,3,2,1)
                .stream()
                .takeWhile(x->x<=5)
                .collect(Collectors.toList()));


        System.out.println(Arrays.asList(3,4,10,9,8,7,6,5,4,3,2,1)
                .stream()
                .dropWhile(x->x<=5)
                .collect(Collectors.toList()));




    }
}
