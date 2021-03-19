package com.hw.counter;

import com.hw.counter.Counter;

import java.util.ArrayList;
import java.util.Collection;

public class CounterMain extends Counter {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Collection<Thread> threadCollection = new ArrayList<Thread>();


        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(counter);
            thread.start();
            threadCollection.add(thread);
        }

        for (Thread thread : threadCollection){
            thread.join();
        }

        System.out.println(atomicInteger);
    }








}
