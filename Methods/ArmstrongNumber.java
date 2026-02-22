package Methods;
import java.util.Scanner;
public class ArmstrongNumber {
    public static boolean  isArmstrong(int number){
        int original=number;
        int sum=0;
        while(number>0){
            int digit = number%10;
            sum+=(digit*digit*digit);
            number/=10;

        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(isArmstrong(number)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
}