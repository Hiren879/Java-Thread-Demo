public class ThreadTest {

    public static void main(String[] args) {

        // every process has at-least one thread - main thread
        // it can have multiple threads as well.
        // process => heap
        // thread => thread stack

        // Three ways to create the threads
        // 1. Extend the Thread class and override run method.
        // 2. Implementing runnable interface

        // 1. Using extend the thread class
        Thread myThread = new MyThread();
        // IMP : we use start method and not the run method
        // IMP : you can not start the same thread again once it is started.
        myThread.start();

        // thread.start(); // It will throw java.lang.IllegalThreadStateException

        // 2. Using runnable
        Thread runnableThread = new Thread(new RunnableThread() {
            @Override
            public void run() {
                System.out.println("runnable thread is running.");
            }
        });

        // Interrupt test
        // myThread.interrupt();

        System.out.println("MAIN THREAD ENDS");
    }
}
