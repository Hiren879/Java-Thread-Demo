
# Thread in Java
Essential thread concepts

1. Every process has at least one thread. i.e. main thread
2. Process has its own heap memory.
3. Thread has its own stack. It can only access its own stack and it can not access the stack of any other thread.
4. Thread can be created in two ways
    1. extend Thread class
    2. implement runnable
5. Thread can be started using **start()** method. And it will run the logic written in **run()** method.

## Join
Why to use Join ?
- To ensure the sequence of the thread execution
- To ensure one thread start its execution after the other

How does it work ?
- Suppose there are 2 threads, thread A & B.
- If you will call B.join() from the run() method of the thread A, then join method will ensure that **task of thread B will be completed before the A.** So here sequence of execution will be
    1. First complete the task of thread B
    2. Then only complete the task of thread A

### Author
---

[Hiren Savalia](https://www.linkedin.com/in/hiren879/)
