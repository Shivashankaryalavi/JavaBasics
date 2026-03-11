 package ARRAYS;
import java.util.Scanner;

class RunningSumOfArray {
    public static int[] runningSum(int[] arr){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter array elements :");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = runningSum(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
        sc.close();
        
        
    }
}