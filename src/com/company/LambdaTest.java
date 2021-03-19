package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class LambdaTest {
    public static void main(String[] args) {
        AtomicInteger counter =new AtomicInteger(0);
        /*
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                counter.getAndIncrement();
            }
        };
        new Thread(runnable).start();

         */
        new Thread(() -> counter.getAndIncrement()).start();
    }
}
