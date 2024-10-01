import java.util.*;

// Understanding Threads
// Threads are independent paths of execution in a program, they can be used to perform tasks in parallel.
// The life cycle of a thread in Java is controlled by the JVM. The thread states are:
// 1. New: A new thread is created but not started.
// 2. Runnable: A thread is ready to run and waiting for the JVM to schedule it.
// 3. Running: The thread is being executed.
// 4. Blocked: The thread is waiting for a monitor lock to enter a synchronized block/method.
// 5. Waiting: The thread is waiting for another thread to perform a particular action.
// 6. Timed Waiting: The thread is waiting for another thread to perform an action for up to a specified waiting time.
// 7. Terminated: The thread has completed its execution.
// To stop the main method excution, we can use the join() method. The join() method waits for the threads to die.
// The synchronized keyword ensures that only one thread of the program executes at a time, blocking the excution of the other thread.

class Counter {
    int count = 0;

    public synchronized void count() {
        count += 1;
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
    
        Runnable hi = () -> {
        for (int i = 0; i < 10; i++) {
            c.count();
        }
    };
        Runnable hello = () -> {
        for (int i = 0; i < 10; i++) {
            c.count();
        }
    };

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);   
    }
}