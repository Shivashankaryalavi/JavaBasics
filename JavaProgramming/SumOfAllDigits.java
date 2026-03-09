/*
        Write a program to find sum of all digits
 */
package JavaProgramming;
import java.util.Scanner;
public class SumOfAllDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a number :");
        long num =sc.nextLong();
        while(num >0){
            long lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
        System.out.print("The sum of given number is : ");
        System.out.println(sum);
        sc.close();

    }
}