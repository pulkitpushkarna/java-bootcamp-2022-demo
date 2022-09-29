package com.bootrcamp.demo;

@FunctionalInterface
interface Operation {
    void perform(int a, int b);
}

public class FunctionalProgramming {

    static void performOperation(int a, int b, Operation operation) {
        operation.perform(a,b);
    }

    public static void main(String[] args) {

        performOperation(1, 2,(int a, int b)-> {System.out.println(a+b);});
        performOperation(1, 2,(int a, int b)-> {System.out.println(a-b);});
        performOperation(1, 2,(int a, int b)-> {System.out.println(a*2+b*2);});

    }

}


