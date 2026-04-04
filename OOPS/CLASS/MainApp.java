package OOPS.CLASS;

import java.util.Scanner;

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount);
        } else {
            System.out.println(" Invalid deposit amount");
        }
    }

  
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount);
        }
    }
}

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        BankAccount account = new BankAccount(5000);

        int choice;

        do {
            
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println(" Current Balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("BYE BYE");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
