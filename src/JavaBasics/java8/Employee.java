package JavaBasics.java8;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, BigDecimal salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    String department;
}
