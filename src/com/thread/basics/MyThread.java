package com.thread.basics;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from my thread : Thread will go to sleep for 3 seconds.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupt is called. MyThread just wake up.");
            return;
        }
        System.out.println("Hello from my thread : Thread is just woke up");
    }
}
