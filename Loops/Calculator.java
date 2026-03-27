package Loops;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
      
        do{
            System.out.println("1 .Add");
            System.out.println("2 . Substract");
            System.out.println("3.multiply");
            System.out.println("4 .Divide");
            System.out.println("5 .exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();
            if(choice >=1 && choice<=4){
                System.out.println("Enter a number a:");
                int a = sc.nextInt();
                System.out.println("Enter a number b :");
                int b = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Sum is : " +(a+b));
                        break;
                    case 2:
                        System.out.println("Sub is: "+(a-b));
                        break;
                    case 3:
                        System.out.println("Mul is:" +(a*b));
                        break;
                    case 4:
                        if(b!=0){
                            System.out.println("Division is : "+ (a/b));
                    
                        }else{
                            System.out.println("Cannot divide by Zero");
                        }
                        break;
                }
            }
            else{
                System.out.println("Invalid choice! Try Again");
            }
           

          
            
        }
        while(choice!=5);
        System.out.println("Calculator closed");
        sc.close();
    }
}