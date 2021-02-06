import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        String name = "";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[3];

    for (int i = 0; i < persons.length; i++) {

        System.out.println("ENTER YOUR NAME : ");
        name = scanner.nextLine();

        System.out.println("ENTER YOUR PASSWORD");
        password = scanner.nextLine();

        Person person = new Person(name, password);// i will person

        persons[i] = person;

    }




        for (Person p:
              persons) {
            System.out.println(p.toString());
        }
    }


}

class Person {

    private String name;
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
