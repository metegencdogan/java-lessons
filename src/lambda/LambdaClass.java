package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {

    public static void main(String[] args) {

//        Frame frame = new Frame("ActionListener java8");
//
//        Button b = new Button("Click Here");
//        b.setBounds(50, 100, 80, 50);
//
//        b.addActionListener(actionEvent -> System.out.println("Hello world"));
//        frame.add(b);
//
//        frame.setSize(200, 200);
//        frame.setLayout(null);
//        frame.setVisible(true);


        MyInterface myInterface = () -> "Hi";
        System.out.println(myInterface.sayHi());

        MyInterfaceWithSingleParameters myInterfaceWithSingleParameters = (name) -> "Hi " + name;
        System.out.println(myInterfaceWithSingleParameters.sayHi("Nazha"));

        MyInterfaceWithMultipleParameters myInterfaceWithMultipleParameters = (number, name) -> number + " -> Hi " + name;
        System.out.println(myInterfaceWithMultipleParameters.sayHi(1, "Nazha"));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.forEach(System.out::println);

        Map<String, String> dict = new HashMap<>();
        dict.put("Hi","123");
        dict.put("Hello","1234");
        dict.put("Hoi","1235");
        dict.put("Salute","1236");

    }
}

@FunctionalInterface
interface MyInterface { //Functional interface with no parameters
    String sayHi();
}

@FunctionalInterface
interface MyInterfaceWithSingleParameters { //Functional interface with single parameters
    String sayHi(String name);
}

@FunctionalInterface
interface MyInterfaceWithMultipleParameters {
    String sayHi(int number, String name);
}

