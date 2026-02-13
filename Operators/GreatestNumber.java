package Operators;
import java.util.*;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a:");
        int a = sc.nextInt();
        System.out.println("Enter a number b :");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+ " is greater than "+b);
        }
        else if(a==b){
            System.out.println(a+ " is equal to "+ b);
        }
        else{
            System.out.println(b+ " is greater than  "+a);
        }
        sc.close();
        
    }

    
}
