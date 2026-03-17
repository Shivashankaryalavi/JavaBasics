package Basics;
import java.util.Scanner;
public class Palindrome {
    public static boolean palindrome(int num){
        int original =num;
        int reverse=0;
        while(num>0){
            int lastdigit = num%10;
            reverse = reverse*10+ lastdigit;
            num/=10;
        }
       return original==reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EM=nter a number");
        int num = sc.nextInt();
        
        if(palindrome(num)){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
        sc.close();

    }
}