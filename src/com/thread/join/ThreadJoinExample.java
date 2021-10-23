package com.thread.join;

public class ThreadJoinExample {

    // This program will guarantee that there will be total 3 threads and those will print 1 to 20 in sequence.
    // 1. Main thread
    // 2. Thread 1 : will print 1 to 10
    // 3. Thread 2 : will print 11 to 20

    // Using thread.join() method to achieve it.

    // Ensuring following sequence thread1 [1-10] -> thread2 [11-20] -> main thread

    // Thread.join() method will first complete the task assign to the thread on which the join method
    // is called. And then only other thread which called the thread.join will complete its task.

    public static void main(String[] args) {
        // 1. Main thread starts
        System.out.println("Main thread is started");

        // 2. thread1 starts
        Thread myThread1 = new Thread(() -> {
            System.out.println("My thread-1 starts");
            for (int i = 0; i < 10; i++) {
                System.out.println("Value is :: " + i);
            }
            System.out.println("My thread-1 ends");
        });
        myThread1.start();

        // 3. thread2 starts
        Thread myThread2 = new Thread(() -> {
            System.out.println("My thread-2 starts");
            try {
                myThread1.join(); // Thread2 will print 11 to 20 only after thread1 will complete printing 1 to 10
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 11; i <= 20; i++) {
                System.out.println("Value is :: " + i);
            }
            System.out.println("My thread-2 ends");
        });
        myThread2.start();

        try {
            myThread2.join(); // Main thread will complete only after thread2 will complete printing 11 to 20
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is Ends");
    }
}
