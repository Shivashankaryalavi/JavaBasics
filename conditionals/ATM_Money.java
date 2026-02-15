package conditionals;
import java.util.*;
public class ATM_Money{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance =10000;
        System.out.println("Enter a withdrawable amount");
        int amount= sc.nextInt();
        if(amount<=0 || amount % 100 != 0){
            System.out.println("Invalid amount");

        }
        else if (amount >balance){
            System.out.println("Insufficient balance");
        }
        else if(balance-amount<1000){
            System.out.println("Please keep minimum amount");

        }
        else{
            balance -= amount;
            System.out.println("Withdraw succesfully");
            System.out.println("Remaining balance :" + balance);
        }
        sc.close();


}
}
     
        
