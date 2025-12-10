package LLD.DesignPatterns.Creational.Prototype;

//Shallow Copy - Just copy the outer box object, does not copy the inner object
//Deep Copy - Copy both outer object and inner object
public class main {
    public static void main(String[] args) {
        User u1 = new User("Veera", 31, new Address("Chennai"));
        User u2 = u1.clone();

        u2.address.city="Salem";

        System.out.println("u1 data"+u1);
        System.out.println("u2 data"+u2);

    }
}
