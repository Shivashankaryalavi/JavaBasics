package Operators;
import java.util.*;
public class Reverse_Of_Two_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two digit number :");
        int num = sc.nextInt();
        int lastdigit = num % 10;
        int firstdigit = num /10;
        int reversed = (lastdigit *10)+ firstdigit;
        System.out.println("The reversed number is "+ reversed);
    }
    
}
