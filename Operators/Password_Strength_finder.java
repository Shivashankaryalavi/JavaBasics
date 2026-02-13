package Operators;
import java.util.*;

public class Password_Strength_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password ");
        String password = sc.nextLine();
        boolean hasNumber = false;
        for(int i =0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                hasNumber =true;
                break;
            }
        }
            if(password.length()>=8 && hasNumber){
                System.out.println("Strong password ");
            }
            else{
                System.out.println("Weak Password");
            }
            sc.close();

        }

    }
    
