package JavaBasics.MultiThreading;

public class YieldExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T1 running: " + i);
                Thread.yield();  // Hint CPU to switch to other thread
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T2 running: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}

