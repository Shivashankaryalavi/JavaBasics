package ARRAYS;
import java.util.Scanner;
public class FindMaxNumber {
    public static int findMax(int[] array){
        int maximum=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size : ");
        int n =sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter array Elements : ");
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int result = findMax(array);
        System.out.println("Maximum Number is : "+result);
        sc.close();
    }
}