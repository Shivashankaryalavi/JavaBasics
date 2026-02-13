package Operators;
import java.util.*;
public class Smart_Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username");
        String username = sc.next();
        System.out.println("Enter a password");
        String password = sc.next();
        if(username.equals("admin") && password.equals("Java123")){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Invalid username or  password");
        }
        sc.close();


        
    }
    
}
