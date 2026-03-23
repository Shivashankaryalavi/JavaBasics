package SlabPrograms;
import java.util.Scanner;

public class IncomeTaxPayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual income");
        int income = sc.nextInt();
        double tax =0;
        if(income>1200000){
            tax+=(income-1200000)*0.30;
            income = 1200000;
        }
        if(income>800000){
            tax+=(income-800000)*0.20;
            income=800000;
        }
        if(income>500000){
            tax+=(income-500000)*0.10;
            income=500000;
        }
        if(income>100000){
            tax+=(income-100000)*0.05;
            income=100000;
        }
        System.out.printf("Total tax to be paid : %.2f\n " , tax);
        sc.close();
    }
}
