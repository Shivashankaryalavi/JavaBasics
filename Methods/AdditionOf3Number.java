package Methods;
import java.util.Scanner;
public class AdditionOf3Number {
    public static int addition(int a, int b, int c){
        return a+b+c;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first  number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("Enter a third number ");
        int c = sc.nextInt();
        int result = addition(a, b, c);
        System.out.println("Addition of 3 number is : " + result);
        sc.close();
    }
}