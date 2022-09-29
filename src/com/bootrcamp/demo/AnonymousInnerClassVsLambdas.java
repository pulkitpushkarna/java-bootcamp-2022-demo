package com.bootrcamp.demo;

public class AnonymousInnerClassVsLambdas {
    int number = 21;

    void display() {
        Operation operation1 = new Operation() {
            int number = 41;
            @Override
            public void perform(int a, int b) {
                System.out.println(this.number + a + b);
            }
        };

        operation1.perform(1, 2);

        Operation operation2 = (a, b) -> {
            System.out.println(this.number + a + b);
        };

        operation2.perform(1,2);

    }


    public static void main(String[] args) {
        new AnonymousInnerClassVsLambdas().display();
    }

}
