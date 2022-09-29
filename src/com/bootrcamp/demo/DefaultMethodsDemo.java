package com.bootrcamp.demo;

interface MyInterface1 {
    default void display() {
        System.out.println("MyInterface1");
    }
}

interface MyInterface2 {
    default void display() {
        System.out.println("MyInterface2");
    }
}

interface MyInterface3 extends MyInterface1, MyInterface2 {
    default void display() {
        MyInterface1.super.display();
        MyInterface2.super.display();
        System.out.println("MyInterface3");
    }
}

public class DefaultMethodsDemo implements MyInterface3 {
    public void display() {
        MyInterface3.super.display();
        System.out.println("DefaultMethodsDemo");
    }


    public static void main(String[] args) {
        new DefaultMethodsDemo().display();
    }
}
