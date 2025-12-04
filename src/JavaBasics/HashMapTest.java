package JavaBasics;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> aMap = new HashMap();
        aMap.put("1", "A");
        aMap.put("2", "B");
        aMap.put("3", "C");
        System.out.println(aMap);

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
