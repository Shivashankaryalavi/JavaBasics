package OOPS;
import java.util.Scanner;

class Account{
    private  double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Please enter valid amount to deposit");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufiicient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Account a = new Account();
    System.out.println("Enter amount to deposit");
    a.deposit(sc.nextDouble());
    System.out.println("Enter amount to withdraw");
    a.withdraw(sc.nextDouble());
    System.out.println("balance :"+ a.getBalance());
    sc.close();
    }
    
}
