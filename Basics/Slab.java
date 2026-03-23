package Basics;
import java.util.*;

public class Slab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n == 2 || n == 3) {
            System.out.println("Not possible");
            return;
        }

        // print even numbers
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        // print odd numbers
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        
    }
}
