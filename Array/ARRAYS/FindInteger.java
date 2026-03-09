package ARRAYS;
import java.util.Scanner;
public class FindInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ARRAY SIZE:");
        int n=sc.nextInt();
        int arr[]=new int[n];
   
        System.out.println("Enter a elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number to find");
        int find=sc.nextInt();
        boolean found = false;
        for(int element:arr){
            if(element==find){
                found =true;
                break;
            }
            
        }
        if(found){
            System.out.println("Number Found");
        }
        else{
            System.out.println("Number not Found");
        }
        sc.close();

      
    }
}