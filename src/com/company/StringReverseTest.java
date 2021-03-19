package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.*;

public class StringReverseTest {
    public static void main(String[] args) throws IOException {

        Supplier<String> stringSupplier = () ->{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };
        String inputString = stringSupplier.get();


        Function<String,String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse)
                .reverse().toString();
        UnaryOperator<String> upperCaseFunction =  String::toUpperCase;
        Function<String,Integer> countFunction = stringForCount -> stringForCount.length();
        Consumer<String> printer = stringToPrint-> System.out.println(stringToPrint);
        Predicate<String> isEmptyPredicate = str -> str.isEmpty();
        System.out.println(countFunction.apply(inputString));
        printer.accept(inputString);
        changeString(inputString, reverseFunction);
        changeString(inputString,upperCaseFunction);
        System.out.println(isEmptyPredicate.test(inputString));

    }
    public static void changeString(String string , Function<String,String> function){
        String newString = function.apply(string);
        System.out.println(newString);
    }
}
