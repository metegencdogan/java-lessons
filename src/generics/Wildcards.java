package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Wildcards {
    //1 -> Generic Type MOST STRICT
    //2 -> LOWER BOUNDED WILDCARDS
    //3 -> UPPER BOUNDED WILDCARDS
    //4 -> WILDCARDS
    //5 -> RAW TYPE

    //Upper Bounded Wildcards
    public static void process(ArrayList<? extends Integer> list) {
        for (int i = 1; i <= 10; i++) {
//            list.add(1);
        }
    }

    //Lower Bounded Wildcards
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(1);
        }
    }

    //Unbounded Wildcards
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }


    //Wildcard Capture and Helper Methods
    public static void foo(List<?> i) {

        fooHelper(i);

        String[] array = new String[10];

    }


    //Helper
    public static <T> void fooHelper(List<T> l) {

        l.set(0, l.get(0));

    }

}
