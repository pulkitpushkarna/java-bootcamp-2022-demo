package com.bootrcamp.demo;

interface MyReferenceInterface{
    void display(int a);
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        MyReferenceInterface myReferenceInterface = (i)-> System.out.println(i);
        myReferenceInterface.display(5);
        myReferenceInterface = JDKFunctionalInterfaceDemo::someStaticMethod;
        myReferenceInterface.display(2);
        myReferenceInterface = new JDKFunctionalInterfaceDemo()::someNonStaticMethod;
        myReferenceInterface.display(1);

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
    }
}
