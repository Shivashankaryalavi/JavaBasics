package Loops;
import java.util.*;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int original = num;
        int sum =0;
      
        while(num>0){
            int digit = num%10;
            sum+= (digit*digit*digit);
            num/=10;

        }
        if(original == sum){
            System.out.println(original +" is Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong Number");
        }
        sc.close();

    }
}