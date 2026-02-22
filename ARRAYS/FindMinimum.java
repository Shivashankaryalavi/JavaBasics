package ARRAYS;
import java.util.Scanner;
public class FindMinimum {
    public static int findMin(int[] arr){
        int minimum =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter an Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = findMin(arr);
        System.out.println("Minimum number is : " +result);
    }
}