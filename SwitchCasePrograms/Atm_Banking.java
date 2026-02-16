package SwitchCasePrograms;
import java.util.*;
public class Atm_Banking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for  Withdraw");
        System.out.println("2 for  BalanceCheck");
        System.out.println("3 for  Deposit");

        int balance =10000;
        System.out.println("choose an option");

        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("enter a amount to withdraw");
                int amount = sc.nextInt();
                if(amount > balance ){
                    System.out.println("Insufficient balance");
                }
                else{
                    System.out.println("withdraw succesful");
                    System.out.println("Remaining balance after withdraw : "+ (balance-= amount));
                  
                
               
                }
                break;
               
            case 2:
                System.out.println("Available balance is " + balance);
                break;
            case 3:
                System.out.println("Enter a amount to deposit");
                int depamount =sc.nextInt();
                balance+=depamount;
                System.out.println("Available balance after deposit  is :" + (balance) );
                break;
            
            default :
                 System.out.println("invalid enter");
                
        }
      
        sc.close();  
    }
    }
    
    
