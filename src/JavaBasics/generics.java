package JavaBasics;
import java.util.*;
public class generics {

    public  static  class A{

    }
    public  static class  B extends A{

    }
    public  static  class C extends A{

    }

    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        List<? extends A> listE = new ArrayList<>();

        ArrayList<?> names = new ArrayList<>();

        ArrayList listA = new ArrayList();
        listA.add("hello");
        listA.add(10);

        String s = (String) listA.get(1); // Runtime error
    }

}
