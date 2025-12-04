package JavaBasics.MultiThreading.Runnable;

public class CustomRunnable implements Runnable{
    String task;
    public CustomRunnable(String name){
       this.task = task;
    }

    @Override
    public void run(){
        System.out.println(task + " Running "+Thread.currentThread().getName());
    }
}
