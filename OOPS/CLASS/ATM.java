package OOPS.CLASS;
import java.util.Scanner;

public class ATM {
    private int money;
    int amount;
    //setter
    public void setmoney(int money){
        this.money=money;
    }
    public int getmoney(){
        if(amount>0 && amount<money){
        return money-amount;
    }
    return 0;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();
        System.out.println("Enter a amount to withdraw");
        a.amount = sc.nextInt();
        a.setmoney(25000);
        System.out.println(a.getmoney());
    }
}
