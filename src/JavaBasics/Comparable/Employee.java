package JavaBasics.Comparable;

public class Employee implements  Comparable<Employee>{
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    Employee(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee emp) {
//        return  Integer.compare(this.id, emp.id);
        return (this.id < emp.id) ? 1 : (this.id == emp.id) ? 0 : -1;
    }

}
