package com.bootrcamp.demo.Java9_17;

interface StringManipulationUtils{

    private static String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }

    static String toLowerReverse(String string){
        return reverse(string).toLowerCase();
    }

    static String toUpperReverse(String string){
        return reverse(string).toUpperCase();
    }


}


public class PrivateInterfaceDemo {
    public static void main(String[] args) {
        System.out.println(StringManipulationUtils.toUpperReverse("Peter"));
        System.out.println(StringManipulationUtils.toLowerReverse("Peter"));

    }
}
