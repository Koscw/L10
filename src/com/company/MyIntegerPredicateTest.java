package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MyIntegerPredicateTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(reader.readLine());

        MyIntegerPredicate predicate = integer -> integer%2==0;
        MyIntegerPredicate predicatePositive = integer -> integer>0;
        MyIntegerPredicate predicateKratno5 = integer -> integer%5==0;

        checkNumberAndPrint(number,predicate);
        checkNumberAndPrint(number,predicatePositive);
        checkNumberAndPrint(number,predicateKratno5);

        class EvenPredicate implements MyIntegerPredicate {
            @Override
            public boolean test(Integer integer) {
                    return integer%2 ==0;
            }

        }

    }
    private static void checkNumberAndPrint(Integer number, MyIntegerPredicate predicate){
        System.out.println(predicate.test(number));
    }
}


