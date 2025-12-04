package JavaBasics.MultiThreading.Thread;

public class OrderTask extends  Thread{
    public String task;
    public OrderTask(String task){
        this.task = task;
    }

    @Override
    public  void run(){
        System.out.println(task+" Processing "+ Thread.currentThread().getName());
    }

}
