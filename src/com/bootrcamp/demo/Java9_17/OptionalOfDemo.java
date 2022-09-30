package com.bootrcamp.demo.Java9_17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalOfDemo {

    public static void main(String[] args) {

        List<List<Integer>> list=Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12),
                Arrays.asList(13,14,15,16)
        );



        System.out.println(list);
        System.out.println(list.stream().flatMap(e->e.stream()).collect(Collectors.toList()));;

       Optional<Integer> optionalInteger = Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(e->e>50)
                .findFirst()
                .or(()-> Optional.of(-1));
        System.out.println(optionalInteger.get());


        System.out.println(IntStream.range(1,10)
                .boxed().map(e->e*2)
                .reduce(0,(sum,number)->number+sum));;


    }
}
