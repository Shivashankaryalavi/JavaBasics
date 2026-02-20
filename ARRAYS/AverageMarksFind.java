package ARRAYS;
import java.util.Scanner;
public class AverageMarksFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int sum =0;
        System.out.println("Enter a marks of physics");
        for(int i=0;i<arr.length;i++){   
            arr[i]=sc.nextInt();
        }
        for(int element:arr){
             sum+=element;
        }
        System.out.println("Average of physics marks is : "+((double)sum/n));
        sc.close();
    }
}