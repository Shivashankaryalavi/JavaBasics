package SwitchCasePrograms;
import java.util.*;
public class BankManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To The State Bank Of India");
        System.out.println("1   Create Account");
        System.out.println("2   Login         ");
        System.out.println("3   withdraw amount  ");
        System.out.println("4   Exit          ");

        int balance  = 25000;
        String Username = "Shiva@12345";
        String savedpin="9339";

        int op = sc.nextInt();
        sc.nextLine();
       
        switch (op) {
            case 1:
                System.out.println("Please enter your full name");
                String name =sc.nextLine();
                System.out.println("Please enter your age");
                int age = sc.nextInt();
                if(age<18){
                    System.out.println("Sorry you are not eligible for create an account");
                }
                else{
                    System.out.println("enter your Mobile number");
                    String number =sc.next();
                    if(number.length() !=10 || !number.matches("\\d+")){
                        System.out.println("Invalid Mobile number,please enter a correct number");
                    }
                    else{
                        System.out.println("Enter a pin");
                        savedpin=sc.next();
                        if(!savedpin.matches("[0-9]{4}")){
                            System.out.println("Invalid pin,pin must be 4 digits");
                        }
                        System.out.println("You are succesfully created an account");
                    }
                } 
              break;
        
        
        case 2:
            System.out.println("enter a username :");
            String username = sc.nextLine();
            System.out.println("Enter a pin");
            String pin = sc.next();
            if(savedpin.equals(pin)&& Username.equals(username)){
                System.out.println("Login succesfull");
            }
            else{
                System.out.println("Invalid  Username or pin");
            }
            break;
        case 3:
            System.out.println("Enter a amount to withdraw");
            int withdraw =sc.nextInt();
            if(withdraw >balance || withdraw < 0 ){
                System.out.println("Insufficient balance");
            }
            else{
                System.out.println("withdraw succesful");
                balance-=withdraw;
                System.out.println("Remaining balance after withdraw :" + balance);
            } 
        default :
                System.out.println("Exit");





        }

    }

    }
