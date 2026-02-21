package Methods;
import java.util.Scanner;
public class CountDigits {
    public static int count(int n){
        if(n==0) return 1;
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = count(n);
        System.out.println("Number of Digits : " +result);
        sc.close();

    }
}