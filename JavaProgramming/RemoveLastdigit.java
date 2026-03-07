package JavaProgramming;

import java.util.Scanner;

public class RemoveLastdigit {

    public static void removelastdigit(int num){
        int removelastdigit = num/10;
        System.out.println(removelastdigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        removelastdigit(sc.nextInt());
        sc.close();
    }
}