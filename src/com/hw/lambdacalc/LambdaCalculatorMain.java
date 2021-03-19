package com.hw.lambdacalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LambdaCalculatorMain{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        int num1= Integer.parseInt(reader.readLine());
        System.out.println("Enter the operation: ADD/add/+ SUBTRACT/subtract/- MULTIPLY/multiply/*  DIVIDE/divide/ (/)  ");
        String operation = reader.readLine();
        System.out.println("Enter the second number");
        int num2 = Integer.parseInt(reader.readLine());
       /// Integer.bitCount()
        LambdaCalculator.result(num1,operation,num2);
    }
}
