package com.bootrcamp.demo.Java9_17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        List.copyOf(list).add(1);

        list.stream()
                .filter(e->e>1)
                .collect(Collectors.toUnmodifiableList()).add(4);

    }
}
