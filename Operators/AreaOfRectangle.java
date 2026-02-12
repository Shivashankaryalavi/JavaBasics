package Operators;

import java.util.*;
public class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter a breadth of the rectangle :");
        int breadth = sc.nextInt();
        int area =(length * breadth);
        System.out.println("Area of rectangle is :"+ area+ " m^2");
    }
}