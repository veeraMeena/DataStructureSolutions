package JavaBasics.MultiThreading.Thread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new OrderTask("Pencil");
        Thread t2 = new OrderTask("Pen");
        Thread t3 = new OrderTask("Rubber");
        Thread t4 = new OrderTask("Bottel");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
