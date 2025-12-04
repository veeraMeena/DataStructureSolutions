import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HashMap<String, String> aMap = new HashMap<>();
        aMap.put("A", "1");
        System.out.println(add());
        System.out.println(add(1));
        System.out.println(add(1,2,3));

        List<String> aList = new ArrayList<>();

        Stack<String> st = new Stack<>();

    }

    public static int add(int ...a){
        int sum = 0;
        for(int i:  a){
            sum = sum + i;
        }
        return  sum;
    }
}
