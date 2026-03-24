package SlabPrograms;
import java.util.Scanner;
public class ParkingCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an hour");
        int hour = sc.nextInt();
        double charge =0;
        if(hour<=2){
            charge = hour * 20;
        }
        else if (hour <=5){
            charge = (2*20)+(hour-2)*30;
        }
    
        else {
            charge =(2*20)+(3*30)+(hour-5)*40;
        }
        System.out.printf("The parking charges to be paid : %.2f\n ", charge);
        sc.close();
    }
    
}
