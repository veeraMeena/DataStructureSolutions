package LLD.DesignPatterns.Creational.Builder;

public class main {
    public static void main(String[] args) {
         ProfileBuilder profileBuilder = new ProfileBuilder.Builder()
                                                .setName("Veera")
                                                 .setAge(31)
                                                 .setGender("Male")
                                                  .build();

         System.out.print(profileBuilder.getName());


    }
}
