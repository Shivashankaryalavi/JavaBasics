package Operators;
import java.util.*;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer : ");
        int a =sc.nextInt();
        if(a%2 ==0){
            System.out.println(a+ " is an Even Number");
        }
        else{
            System.out.println(a + " is an Odd Number");

        }
        sc.close();
    }
    
}
