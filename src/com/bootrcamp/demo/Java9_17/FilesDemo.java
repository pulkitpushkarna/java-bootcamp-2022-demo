package com.bootrcamp.demo.Java9_17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        String path = "/Users/pulkitpushkarna/demo.txt";
        String string = Files.readString(Path.of(path));
        System.out.println(string);

        Files.writeString(Path.of(path),".This is line 5.", StandardOpenOption.APPEND);

        Files.readAllLines(Path.of(path)).stream().map(s->s.toUpperCase()).forEach(System.out::println);



    }
}
