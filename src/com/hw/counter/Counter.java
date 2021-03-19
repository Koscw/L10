package com.hw.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter extends Thread{
    static AtomicInteger atomicInteger = new AtomicInteger();
    public static void nextCounter() {
        atomicInteger.incrementAndGet();
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            nextCounter();
        }
    }
}
