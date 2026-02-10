package conditionals;
import java.util.*;
public class EligibleVoters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a age :");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are elgible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}