package Operators;
import java.util.*;
public class Job_Eligibility_Checker {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Enter a CGPA :");
        float cgpa = sc.nextFloat();
        System.out.println("Are you Citizen : true/false?");
        boolean isCitizen =sc.nextBoolean();
        if(age >18 && cgpa >= 7 && isCitizen){
            System.out.println("You are eligible for job");
        
        }
        else{
            System.out.println("You are not eligible for job");
        }
        sc.close();
    }
    
}
