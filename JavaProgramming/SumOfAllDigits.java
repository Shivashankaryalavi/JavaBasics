package JavaProgramming;
import java.util.Scanner;
public class SumOfAllDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a number :");
        int num =sc.nextInt();
        while(num >0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
        System.out.print("The sum of given number is : ");
        System.out.println(sum);
        sc.close();

    }
}