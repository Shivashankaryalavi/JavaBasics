package ARRAYS;
import java.util.Scanner;
public class EvenOddCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Array size: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evencount =0;
        int oddcount =0;
        int evensum =0;
        int oddsum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evensum+=arr[i];
                evencount++;
            }
            else{
                oddsum+=arr[i];
                oddcount++;

            }
        }
        System.out.println("Even numbers count :"+evencount);
        System.out.println("Sum of Even number is:"+evensum);
        System.out.println("Odd numbers count:"+oddcount);
        System.out.println("Sum of Odd number is:"+oddsum);
        sc.close();
       
        
      
    }
}