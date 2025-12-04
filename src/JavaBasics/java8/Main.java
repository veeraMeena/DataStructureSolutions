package JavaBasics.java8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printing even Numbers");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("Optional Example");
        Optional<String> optional = Optional.ofNullable("A");
        System.out.println(optional.isPresent());

        System.out.println("Map example");
        List<String> listString = list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(listString);

        System.out.println("FlatMap example");
        List<List<Integer>> flatMapList = Arrays.asList( Arrays.asList(2, 4, 6), Arrays.asList(3, 5, 7));
        List<Integer> resultOfflatMap =  flatMapList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(resultOfflatMap);

        System.out.println("Sorting example");
        List<Integer> descSorted =  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSorted);

        List<Employee> employeeList = Arrays.asList(new Employee("A", new BigDecimal(10), "D1"),
                new Employee("B", new BigDecimal(20), "D2"),
                new Employee("C", new BigDecimal(30), "D1"),
                new Employee("D", new BigDecimal(40), "D1") );

        //print the sum of the salary by department wise

        HashMap<String, BigDecimal> resultData = new HashMap<>();
        employeeList.stream().forEach(a-> {
            if(resultData!=null && resultData.get(a.getDepartment())!=null){
                BigDecimal value = resultData.get(a.getDepartment()).add(a.getSalary());
                resultData.put(a.getDepartment(), value);
            }else {
                resultData.put(a.getDepartment(), a.getSalary());
            }
        });
        System.out.println(resultData);

       Map<String, BigDecimal> m =  employeeList.stream().collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary, BigDecimal::add));
        System.out.println(m);


    }
}
