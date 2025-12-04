package JavaBasics;

public class effectivelyFinal {

    public static void main(String[] args) {
         int x = 10;
        // x = 20;
        Runnable r = ()->System.out.print(x);
        r.run();
    }


}
