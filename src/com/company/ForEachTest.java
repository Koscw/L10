package com.company;

import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three");
        strings.forEach(System.out::println);
        Consumer<String> newString = String::new;


    }
    public static void print(String string){
        System.out.println("////////////////////");

    }
}
