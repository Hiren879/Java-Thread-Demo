
# Thread in Java
Essential thread concepts

1. Every process has at least one thread. i.e. main thread
2. Process has its own heap memory.
3. Thread has its own stack. It can only access its own stack and it can not access the stack of any other thread.
4. Thread can be created in two ways
    1. extend Thread class
    2. implement runnable
5. Thread can be started using **start()** method. And it will run the logic written in **run()** method.
6. Thread shares the same heap memory so if you will change the instance variable of an object, the change will be visible to all other threads working with that object.
7. Race Condition : When two or more threads shares the same resource and tries to access them.
8. Race Condition Solution : Write a synchronized method/block.
9. wait(), notify() & notifyAll() can only be called from synchronized block.
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
