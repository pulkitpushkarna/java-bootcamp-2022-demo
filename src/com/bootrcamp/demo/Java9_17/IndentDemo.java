package com.bootrcamp.demo.Java9_17;

public class IndentDemo {

    public static void main(String[] args) {
        String string = "This is my sentence.";
        System.out.println(string);
        string=string.indent(10);
        System.out.println(string);
        string=string.indent(-5);
        System.out.println(string);
    }
}
