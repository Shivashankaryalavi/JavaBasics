package OOPS;

public class BankManagement {
    class BankAccount{
        private double balance;
        public BankAccount (double balance){
            this.balance=balance;
        }
        public double getbalance(){
            return balance;
        }
        public void deposit(double amount){
            if(amount>0) {
                balane+=amount;
                System.out.println("Deposited: " + amount);
            }else{
                System.out.println("Invalid Deposit Amount");
            }
            


        }

    }
}
