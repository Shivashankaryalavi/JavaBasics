package Loops;
import java.util.Scanner;
public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PASSWORD = 1234;
        int pass;
        int attempts =0;
        do{
            System.out.println("enter a password");
             pass = sc.nextInt();
            if(pass == PASSWORD){
                System.out.println("Access Granted");
            }
            else{
                attempts++;
                if(attempts<3){
                System.out.println("Wrong password! Attempts left " +(3-attempts));
                }
            }
        }while(PASSWORD!=pass&& attempts<3);
        if(attempts==3){
            System.out.println("Too many failed attempts.Account locked");
        }
        sc.close();

    
    }
}