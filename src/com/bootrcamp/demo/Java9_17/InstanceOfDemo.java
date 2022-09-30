package com.bootrcamp.demo.Java9_17;

import java.util.Objects;

public class InstanceOfDemo {

    public static void main(String[] args) {

        Object object = "Hello Java";
        if(object instanceof String string){
//            String string = (String)object;
            System.out.println(string.toUpperCase());
        }

    }
}
