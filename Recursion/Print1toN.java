package Recursion;
import java.util.Scanner;
public class Print1toN {
    public static void print1toN(int n,int b){
        if()return ;
        System.out.print(n+" ");

         print1toN(n+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b =100;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        print1toN(n);
        sc.close();
    }
}
