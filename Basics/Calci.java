package Basics;
import java.util.*;
public class Calci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a:");
        int a = sc.nextInt();
        System.out.println("Enter a number b :");
        int b = sc.nextInt();
        System.out.println("Addition  " + (a+b));
        System.out.println("Substraction " + (a-b));
        System.out.println("Multiplication " + (a*b));
        System.out.println("modulus  " + (a%b));
    }
}
