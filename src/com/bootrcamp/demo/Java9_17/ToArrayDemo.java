package com.bootrcamp.demo.Java9_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ToArrayDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(Arrays.toString(integerList.toArray()));

        System.out.println(Arrays.toString(IntStream.range(1,9).toArray()));
    }
}
