package com.bootrcamp.demo;

import java.util.Arrays;
import java.util.Optional;

public class StreamsDemo2 {

    public static void main(String[] args) {

       Optional<Integer> optionalInteger =
//               Arrays.asList(7,9,10,23,80,98,24)
                Arrays.asList(7,9)
                .stream()
                .filter(e-> {System.out.println("filter>>>"+e);  return e%2==0;})
                .map(e-> {System.out.println("map>>>>"+e); return e*2;} )
                .findFirst();

            if(optionalInteger.isPresent()){
                System.out.println("result ::"+optionalInteger.get());
            }else{
                System.out.println("No result found");
            }


        //Lazy evaluation
        System.out.println(Arrays.asList(7,9,10,23,80,98,24)
                .stream()
                .filter(e-> {System.out.println("filter>>>"+e);  return e%2==0;})
                .map(e-> {System.out.println("map>>>>"+e); return e*2;} ));

        Arrays.asList(7,9,10,23,80,98,24)
                .stream()
                .filter(e-> {System.out.println("filter>>>"+e);  return e%2==0;})
                .map(e-> {System.out.println("map>>>>"+e); return e*2;} )
                .forEach(System.out::println);


    }
}
