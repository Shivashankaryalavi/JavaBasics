
import java.util.Scanner;
public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int[] a = new int[sc.nextInt()];
        System.out.println("Array length is ");

        System.out.println(a.length);
         System.out.println("array elements");
        for(int i =0; i<a.length;i++){
            a[i]=sc.nextInt();
           
            System.out.println(a[i]);
        }
        
        
    }
}