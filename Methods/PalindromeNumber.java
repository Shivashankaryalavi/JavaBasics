package Methods;
import java.util.Scanner;
public class PalindromeNumber {

    public static boolean isPalindrome(int n){
        int original =n;
        int reverse =0;
        while(n>0){
        int digit = n%10;
        reverse = reverse*10+digit;
        n/=10;
        }
        return original==reverse;
    }

     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        boolean result = isPalindrome(n);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();

    }
}