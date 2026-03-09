package JavaProgramming;
import java.util.Scanner;
public class FetchAllDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        while(num>0){
            int lastdigit =num%10;
            System.out.println(lastdigit);
            num/=10;

     
        }
        sc.close();
    }
}