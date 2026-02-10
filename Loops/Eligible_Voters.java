package Loops;
import java.util.*;

public class Eligible_Voters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote ");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

    }
    
}
