package Operators;
import java.util.*;

public class KilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Kilometer :");
        double km = sc.nextDouble();
        double meter = km* 1000;
        System.out.println(meter + " meter");
        sc.close();

        
    }
    
    
}
