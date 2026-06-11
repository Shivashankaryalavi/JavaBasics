package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingGenPrm {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList(Arrays.asList(10,30,20,40));
        System.out.println("Elements before sorting");
        System.out.println(a1);
        System.out.println("Elements after sorting");
        Collections.sort(a1);
        System.out.println(a1);
        System.out.println("Elements after reversing");
        Collections.reverse(a1);
        System.out.println(a1);


    }
    
}
