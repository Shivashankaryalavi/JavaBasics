package Loops;
import java.util.*;
public class Loo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  numer :");
        int password= 1234;
        int pass=0;
        while(pass!=password){
               System.out.println("enter a password ");
               pass = sc.nextInt();
        }
        System.out.print("login succesfull");
    }
}