package JavaBasics.MultiThreading.PrintEvenOdd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddPrint {

    static int number = 1;
    static int limit =10;
    static Object lock = new Object();

    public static void printOdd() {
        synchronized (lock) {
            while (number <= limit) {
                if (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println(number);
                    number++;
                    lock.notify();
                }

            }
        }
    }
    public static void printEven() {
        synchronized (lock) {
            while (number <= limit) {
                if (number % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println(number);
                    number++;
                    lock.notify();
                }
            }
        }
    }


}
