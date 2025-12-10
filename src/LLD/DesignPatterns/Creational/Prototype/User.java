package LLD.DesignPatterns.Creational.Prototype;

public class User  implements  Prototype{
    public  String name;
    public  Integer age;
    public  Address address;

    public  User(String name, Integer age, Address address){
        this.address = address;
        this.name= name;
        this.age = age;
    }
    @Override
    public User clone(){
        return  new User(name, age, new Address(address.city));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
