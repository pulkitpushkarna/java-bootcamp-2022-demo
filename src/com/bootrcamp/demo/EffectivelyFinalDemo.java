package com.bootrcamp.demo;

public class EffectivelyFinalDemo {

    public static void main(String[] args) throws InterruptedException {
        final int value = 23;
        new Thread(() -> System.out.println(value)).start();
        Thread.sleep(1000L);
    }
}
