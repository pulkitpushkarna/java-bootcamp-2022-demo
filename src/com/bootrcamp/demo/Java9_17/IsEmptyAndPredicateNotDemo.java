package com.bootrcamp.demo.Java9_17;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IsEmptyAndPredicateNotDemo {
    public static void main(String[] args) {
        Optional<Integer> integerOptional = IntStream
                .range(1,10)
                .boxed()
                .filter(Predicate.not(e->e>50))
                .findFirst();
        System.out.println(integerOptional);
        System.out.println(integerOptional.isEmpty());
        System.out.println(integerOptional.isPresent());




    }

}
