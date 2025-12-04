package JavaBasics.MultiThreading.Runnable;

public class main {
    public static void main(String[] args) {
        CustomRunnable r1 = new CustomRunnable("A");
        CustomRunnable r2 = new CustomRunnable("B");
        CustomRunnable r3 = new CustomRunnable("C");
        CustomRunnable r4 = new CustomRunnable("D");

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");
        Thread t3 = new Thread(r3, "C");
        Thread t4 = new Thread(r4, "D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
