package com.thread.synchronization;

public class ThreadSynchronization {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountThread thread1 = new CountThread(countDown);
        CountThread thread2 = new CountThread(countDown);

        thread1.start();
        thread2.start();
    }
}

class CountThread extends Thread {

    private CountDown countDown;

    public CountThread(CountDown countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        countDown.doCount();
    }
}

class CountDown {

    private int i;

    public void doCount() {
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " :  " + i);
            }
        }
    }
}
