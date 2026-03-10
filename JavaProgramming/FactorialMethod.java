package JavaProgramming;
import java.util.Scanner;
public class FactorialMethod {
    public static int factorial(int n){
        int fact =1;
        for(int i =2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n +" is "+ factorial(n));
        sc.close();
     }
}