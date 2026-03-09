package ARRAYS;
import java.util.Scanner;
public class FloatsSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int n = sc.nextInt();
        float arr[]=new float[n];
        float sum=0f;
        System.out.println("Enter an elements");
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextFloat();
        }
        
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
        }
        System.out.println("The sum of floats is " +sum);
        sc.close();
    }
}