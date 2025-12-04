package JavaBasics.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "A"));
        emp.add(new Employee(5, "B"));
        emp.add(new Employee(3, "C"));
        emp.add(new Employee(2, "D"));
        emp.add(new Employee(9, "E"));
        emp.add(new Employee(6, "F"));

        //sort with descending
        Collections.sort(emp);
        System.out.println(emp);

        emp.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getName));


    }
}
