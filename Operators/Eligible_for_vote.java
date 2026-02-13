package Operators;
import java.util.*;

public class Eligible_for_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age :");
        int age = sc.nextInt();
        System.out.println("Are you a citizen :true or false");
        boolean isCitizen = sc.nextBoolean();
         
   
        if(age>18 && isCitizen){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligibe to vote");
        }
        sc.close();
    }

    
}
