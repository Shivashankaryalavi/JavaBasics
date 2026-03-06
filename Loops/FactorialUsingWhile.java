package Loops;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static int Factorial(int n){
      
        if(n==0||n==1){
            return 1;
        }
       
        int fact =1;
        int i =2;
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