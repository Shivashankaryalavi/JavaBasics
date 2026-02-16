package SwitchCasePrograms;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First number :");
        double num1 = sc.nextDouble();
        System.out.println("Enter an Operator :");
        char op =sc.next().charAt(0);
        System.out.println("Enter a Second number :");
        double num2 = sc.nextDouble();
        switch (op) {
            case '+':
                System.out.println("Addition of Two number is :" + (num1 + num2));
                
                break;
            case '-':
                System.out.println("Substraction of two number is :" + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of two number is :" + (num1*num2));
                break;
            case '/':
                 if(num2==0){
                    System.out.println("cannot divide by zero:");
                    break;
                }
                System.out.println("Division of two number is :" + (num1/num2));
                break;
            case '%':
                System.out.println("Modulus of two number is :" + (num1%num2));
                break;
            default :
                System.out.println("Invalid Operator or numbers");
        
                
        }
        sc.close();


    }
    
}
