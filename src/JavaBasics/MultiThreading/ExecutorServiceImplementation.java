package JavaBasics.MultiThreading;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ExecutorService is a framework in Java used to create and manage threads efficiently.
 */
public class ExecutorServiceImplementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicInteger initialValue = new AtomicInteger(0);
        Integer outPut = 0;
        ExecutorService service = Executors.newFixedThreadPool(10);
        Callable<Integer> function = () -> initialValue.addAndGet(2);
        Future<Integer> result = service.submit(function);
        try{
            outPut = result.get();
        }catch(Exception ex){

        }
        System.out.println(outPut);

    }
}
