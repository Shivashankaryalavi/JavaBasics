package JavaProgramming;
import java.util.Scanner;
public class ProductOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int prod =1;
        while(num>0){
            int lastDigit = num%10;
            prod*=lastDigit;
            num/=10;
        }
        System.out.println("The product of digits is :" + prod);
        sc.close();
    }
}