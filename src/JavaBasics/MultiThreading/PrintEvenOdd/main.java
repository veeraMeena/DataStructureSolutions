package JavaBasics.MultiThreading.PrintEvenOdd;

public class main {
    public static void main(String[] args) {
        Thread t1 = new Thread(EvenOddPrint:: printOdd);
        Thread t2 = new Thread(EvenOddPrint:: printEven);
        t1.start();
        t2.start();
    }
}
