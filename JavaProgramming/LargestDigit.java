package JavaProgramming;
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int  num = sc.nextInt();
        int largest =0;
        while(num>0){
            int lastDigit = num%10;
            if(lastDigit > largest){
                largest = lastDigit;

            }
            num/=10;
        }
        System.out.println("Larget in a given number is :" + largest);
        sc.close();
    }
    
}
