package Basics;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a1[] = {2,4,6,8};
        int a2[]={3,1,5,7};
        int[] temp = new int[a1.length +a2.length];
        System.arraycopy(a1,0,temp,0,a1.length);
        System.arraycopy(a2,0,temp,a1.length,a2.length);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));

        
    }

    
}
