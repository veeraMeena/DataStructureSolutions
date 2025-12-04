package JavaBasics;


/**
 * Java is always pass by value.
 */
public class PassByValue {

    public static void main(String[] args) {
        Dog dogA = new Dog("A");
        Dog dogB = new Dog("B");
        System.out.println("Before swap attempt: dogA name is " + dogA.name);

        ReferenceReassignmentExample.tryToSwap(dogA, dogB);


        // The original 'dogA' reference still points to the original object
        System.out.println("After swap attempt: dogA name is " + dogA.name);

        updateData(dogA);
        System.out.println("After swap attempt: dogA name is " + dogA.name);
    }

    private static void updateData(Dog dogA) {
        dogA.name = "CC";
    }

    static class Dog {
        String name;
        Dog(String name) { this.name = name; }
    }

    public static class ReferenceReassignmentExample {
        public static void tryToSwap(Dog d1, Dog d2) {
            Dog temp = d1;
            // This ONLY changes the local 'd1' parameter inside this method
            d1 = d2;
            d2 = temp;
            System.out.println("Inside method: d1 name is " + d1.name);
        }


    }
}
