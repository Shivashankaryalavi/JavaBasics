package JavaProgramming;
import java.util.Scanner;
public class FetchAllDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Fetching each digits one by one from last to first : ");
        
        while(num>0){
            int lastdigit =num%10;
            System.out.print(lastdigit+ " ");
            num/=10;

     
        }
        sc.close();
    }
}