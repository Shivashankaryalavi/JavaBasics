package SlabPrograms;
import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        int fee;
        if(age <5){
            fee=0;
        }
        else if (age <=18){
            fee =100;
            
        }
        else{
            fee =200;
        }
        System.out.println("Ticket price :"+fee);
        sc.close();
    }
    
}
