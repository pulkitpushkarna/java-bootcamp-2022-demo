package com.bootrcamp.demo.Java9_17;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
       NumberFormat numberFormat = NumberFormat
               .getCompactNumberInstance(new Locale("en","US"), NumberFormat.Style.LONG);
       numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(120000000));
    }
}
