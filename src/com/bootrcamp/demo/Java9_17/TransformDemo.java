package com.bootrcamp.demo.Java9_17;

import java.util.function.Function;

public class TransformDemo {

    public static void main(String[] args) {
        String string = "This is a simple sentence";
        Function<String,String> reverseString = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();

        System.out.println(string.transform(reverseString));

    }
}
