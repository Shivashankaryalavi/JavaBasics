package conditionals;
import java.util.*;
public class Income_Tax_Pay {
    public static void main(String[] args) {
       double tax =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a annual income :");
       double income = sc.nextDouble();
       if(income>1500000){
        tax+= (income-1500000)*0.30;
        income =1500000;
       }
       if(income>1200000){
        tax+= (income-1200000)*0.20;
        income=1200000;
       }
       if(income>900000){
        tax+= (income-900000)*0.15;
        income=900000;
       }
       if(income>600000){
        tax+= (income-600000)*0.10;
        income=600000;
       }
       if(income>300000){
        tax+= (income-300000)*0.05;
        
       }
       
       System.out.println("The tax you paid is " + tax);
   
    }
}