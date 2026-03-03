package Basics;
import java.util.Scanner;
public class Natural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("First "+num+" natural number is :");
        for(int i =1;i<=num;i++){
            

            System.out.println(i);
        }
    }
}