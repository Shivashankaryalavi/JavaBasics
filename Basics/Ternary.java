package Basics;
import java.util.Scanner;
class Student{
    string name;
    static string college = "AITM";
}


public class Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3 :");
        int num3 = sc.nextInt();

        int largest = (num1>num2)? (num1>num3 ? num1: num3) : (num2>num3 ?num2 : num3);
        System.out.println("The largest number is : " + largest);
        student s1 = new 
        sc.close();
    }
}

