package com.bootrcamp.demo;

import java.util.function.*;

public class JDKDefinedFunctionalInterfaces {

    public static void main(String[] args) {
        Consumer<String> consumer = a -> System.out.println(a);
        consumer.accept("54");
        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(9));
        Supplier<Integer> supplier = () -> 9;
        System.out.println(supplier.get());
        Function<Integer, Integer> getSquare = a -> a * a;
        System.out.println(getSquare.apply(5));
        BiFunction<Integer,Integer,Integer> multiply = (a,b)->a*b;
        System.out.println(multiply.apply(2,3));;
    }
}
