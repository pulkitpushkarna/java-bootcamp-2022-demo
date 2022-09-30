package com.bootrcamp.demo.Java9_17;

public class SwitchDemo {

    public static void main(String[] args) {
//        String day = "TUESDAY";
//        String result = switch (day) {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "WEEKDAY";
//            case "SATURDAY", "SUNDAY" -> "WEEKEND";
//            default -> throw new RuntimeException("Not a valid input");
//        };
//
//        System.out.println(result);


        String day = "TUESDAY";
        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                System.out.println("Performing some operation for Weekday");
                yield "WEEKDAY";
            }
            case "SATURDAY", "SUNDAY" -> {
                System.out.println("Performing some operation for Weekend");
                yield "WEEKEND";
            }
            default -> throw new RuntimeException("Not a valid input");
        };

        System.out.println(result);


    }
}
