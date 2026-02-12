package Operators;
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle :");
        double radius = sc.nextDouble();
        double area = 3.14 * radius*radius;
        System.out.println("Area of circle is:" + " "+ area);
        sc.close();

    }

    
}
