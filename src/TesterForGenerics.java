import generics.*;

import javax.print.attribute.standard.OrientationRequested;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TesterForGenerics {
    public static void main(String[] args) {

        Box box = new Box();
        box.setObject(123);
        int number = (int) box.getObject(); //Without generic classes we have to cast our object
        System.out.println(number);

        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setT(123);
        int number1 = genericBox.getT(); //With generics when we put type parameters, we can assign value to variable directly
        System.out.println(number1);

        //Multiple Type Parameters
        Pair<String, Integer> pair1 = new OrderedPair<>("Even", 8);
        Pair<String, String> pair2 = new OrderedPair<>("hello", "world"); //Diamond Feature
        System.out.println(pair1.getKey() + " " + pair1.getValue());
        System.out.println(pair2.getKey() + " " + pair2.getValue());


        //Raw Type
        GenericBox genericBox1 = new GenericBox(); //You do not get error but it shows warning

        //Generic Methods
        Pair<String, String> orderedPair = new OrderedPair<>("Hi", "123");
        Pair<String, String> orderedPair1 = new OrderedPair<>("Hi", "213");

        boolean compareResult = GenericMethods.compare(orderedPair, orderedPair1);

        System.out.println(compareResult);


        //Bounded Type Parameters
        GenericBox<Integer> genericBox2 = new GenericBox<>();
        genericBox2.setT(123);

        genericBox2.inspect(12); // Try with String

        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(1.3);


        GenericBox<?> genericBox3 = new GenericBox<>();


        ArrayList<Number> arrayList1 = new ArrayList<>();
        arrayList1.add(1.2);
        Wildcards.addNumbers(arrayList1);

        ArrayList<Number> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        Wildcards.addNumbers(arrayList2);

    }


}
