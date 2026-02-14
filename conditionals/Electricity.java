package conditionals;
import java.util.*;
public class Electricity {
    public static void main(String[] args) {
       double bill =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a unit you used :");
       double unit = sc.nextDouble();
       if(unit>300){
        bill+= (unit-300)*10;
        unit=300;
       }
       if(unit>200){
        bill+= (unit-200)*7;
        unit=200;
       }
       if(unit>100){
        bill+= (unit-100)*5;
       }
       
    
       
       System.out.println("The bill you paid is " + bill);
   
    }
}