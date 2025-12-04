package JavaBasics.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class RunnableVsCallable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("CAlling Runnable");
            }
        };

        Callable c = new Callable() {
            @Override
            public Integer call() throws Exception {
                return 6 + 10;
            }
        };

        Callable cb = () -> "Returning Callable";
        Runnable rb = () -> System.out.println("Printing Runnable rb");


        rb.run();

        try {
            Object result = c.call();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
