package SlabPrograms;
import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a unit");
        double bill =0;
        int unit = sc.nextInt();

        if(unit>300){
            bill+=(unit-300)*5;
            unit =300; 
        }
        if(unit>200){
            bill+=(unit-200)*3;
            unit =200;
        }
        if(unit>100){
            bill+=(unit-100)*2;
            unit =100;
        }
        if(unit>0){
            bill+=(unit)*1;

        }
        System.out.println("The bill you paid is :"+ bill);
        sc.close();
    }
    
}
