//Day 7 - Q3

package multithreading;

class Counter {

    private int count = 0;

    synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " : " + count);
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
