package ARRAYS;
import java.util.Scanner;
public class BuildArray {
    public static int[] buildArray(int[] arr){
        int nums[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[arr[i]];
            
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int[] result = buildArray(arr);
        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }
        sc.close();

    }
}