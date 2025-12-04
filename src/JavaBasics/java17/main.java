package JavaBasics.java17;

public class main {

    //Make employee as Immutable, we don't have setters, values are private and final
    record Employee(String name, int age) {}

    public static void main(String[] args) {
//        String text = null;
//        System.out.println(text.length());

        String html = """
    <html>
        <body>
            <h1>Hello Java 17</h1>
        </body>
    </html>
    """;

        System.out.println(html);

       Employee e1 =  new Employee("A", 10);

    }
}
