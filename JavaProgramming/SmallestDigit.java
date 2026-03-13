package JavaProgramming;
import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        while(num >0){
            int lastDigit = num%10;
            if(lastDigit < smallest){
                smallest = lastDigit;
            }
            num/=10;
        }
        System.out.println("Smallest digit is : " + smallest);
        sc.close();
    }
    
}
