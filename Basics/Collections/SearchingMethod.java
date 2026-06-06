package Basics.Collections;
import java.util.ArrayList;

public class SearchingMethod {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Hi");
        a1.add("Hello");
        a1.add("Bye");
        a1.add("Good");
        a1.add("Morning");
        System.out.println(a1);

        //indexOf(Object O)
        System.out.println(a1.indexOf("Good"));
        //lastIndexOf(Object O)
        System.out.println(a1.lastIndexOf("Good"));
        //contains(Object o)
        System.out.println(a1.contains("Bye"));
    }
}
