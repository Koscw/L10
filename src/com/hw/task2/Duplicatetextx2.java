package com.hw.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.UnaryOperator;

public class Duplicatetextx2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите слово");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        UnaryOperator<String> unaryOperator = s -> {
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0; i<s.length(); i++)
                stringBuilder.append(s.charAt(i)).append(s.charAt(i));
            return stringBuilder.toString();
        };
        LettersDuplicate(string, unaryOperator);
    }
    static void LettersDuplicate(String s, UnaryOperator<String> unaryOperator){
        System.out.println(unaryOperator.apply(s));
    }
}
