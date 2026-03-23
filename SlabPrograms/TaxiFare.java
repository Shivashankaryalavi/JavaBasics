package SlabPrograms;

import java.util.Scanner;

public class TaxiFare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  distance in km");
        int km = sc.nextInt();
        double bill =0;
        if(km>30){
            bill+=(km-30)*25;
            km=30;
        }
        if(km>15){
            bill+=(km-15)*20;
            km=15;
        }
        if(km>5){
            bill+=(km-5)*15;
            km=5;
        }
        if(km>0){
            bill+=(km)*10;
        }
        System.out.println("Total fare to be paid :" + bill);
        sc.close();
    }
    
}
