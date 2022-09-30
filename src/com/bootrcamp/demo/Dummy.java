package com.bootrcamp.demo;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Dummy {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toUnmodifiableList());

    }
}
