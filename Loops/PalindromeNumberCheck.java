package Loops;
import java.util.*;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original =num;
        int reverse =0;
        while(num>0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num/=10;

        }
       
        if(reverse == original){
            System.out.println(" It is Palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
        sc.close();
    }
    
}
