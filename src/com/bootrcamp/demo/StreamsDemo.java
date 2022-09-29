package com.bootrcamp.demo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        //Ways to create Stream
        System.out.println(Arrays.asList(1,2,3,4,5).stream());
        System.out.println(Stream.of(new int[]{5,6,7,8}));
        System.out.println(Stream.of(9,10,11,12));

        Stream<Integer> integerStream = Arrays.asList(1,2,3,4,5,6,7,8,10).stream();
        integerStream.forEach(e-> System.out.println(e));
        // For Each
        Arrays.asList(11,12,13,14,15,16,17,18,20).stream().forEach(System.out::println);
        // Map
        System.out.println(Arrays.asList(11,12,13,14,15,16,17,18,20)
                .stream()
                .map(e->e*2));;

        System.out.println(Arrays.asList(11,12,13,14,15,16,17,18,20)
                .stream()
                .map(e->e*2)
                .collect(Collectors.toList()));;

          Stream.of(1,2,3,4,5,6,7,8,9,10)
                  .filter(e->e%2==0)
                  .map(e->e*13)
                  .forEach(System.out::println);


        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream()
                .mapToInt(e->e).average());

        System.out.println(Arrays.asList("abc","def", "ghi").stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("-")));;

        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream()
                .collect(Collectors.summarizingInt(x->x)));

        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream()
                .collect(Collectors.counting()));

        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream()
                .collect(Collectors.averagingInt(e->e)));

        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream()
                .collect(Collectors.toMap(e->e,e->e*2)));



    }
}
