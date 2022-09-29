package com.bootrcamp.demo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamVsNormalStream {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        IntStream
                .rangeClosed(1,10)
                .parallel()
                .filter(e->{
                    try {
                        Thread.sleep(1000l);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    return e%2==0;} )
                .map(e->{ try {
                    Thread.sleep(1000l);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                return e*34;})
                .boxed()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);




    }
}
