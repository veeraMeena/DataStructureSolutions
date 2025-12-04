package JavaBasics.MultiThreading;

public class DeadLockExample {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Running the Runnable 1");
                synchronized (object1){
                    System.out.println("got object1 lock");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Trying to get lock for object2");
                    synchronized (object2){
                        System.out.println("got lock of object2");
                    }
                }

            }
        };
        Runnable r2 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Running the Runnable 2");
                synchronized (object2){
                    System.out.println("get lock 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Trying to get lock for object1");
                    synchronized (object1){
                        System.out.println("got lock of object1");
                    }
                }

            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
