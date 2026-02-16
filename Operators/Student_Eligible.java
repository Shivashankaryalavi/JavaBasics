package Operators;
import java.util.*;
public class Student_Eligible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a internal marks :");
        double marks = sc.nextDouble();
        System.out.println("Enter your attendance :");
        double attendance = sc.nextDouble();
        System.out.println((marks >= 80 && attendance >= 90 )? "Eligible for exam" :"Not eligible for exam" );
      
        
    }
}