package Basics;
import java.util.Scanner;
public class IFElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a :");
        int a =sc.nextInt();
        System.out.println("Enter a number b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Yes " +a+" is greater than "+ b);

        }
        else{
            System.out.println("Yes"+b+"is greater than "+a);
        }
            
    }
}