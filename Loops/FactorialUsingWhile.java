package Loops;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static int Factorial(int n){
        int fact =1;
        int i =1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is :");
       System.out.println( Factorial(n));
       sc.close();
    }
}