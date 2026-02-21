package Methods;
import java.util.Scanner;
public class SumOfDigits {
    public static int sum(int number){
        int sum =0;
        while(number >0){
        int digit = number%10;
        sum+=digit;
        number/=10;
        }
        return sum;
       
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        int result =sum(number);
        System.out.println("Sum of Digits is: " + result);
        sc.close();


    }
}