package JavaProgramming;
import java.util.Scanner;
public class Lsatdigit {
    public static void lastdigitnum(int num){
        int lastdigit = num%10;
        System.out.println("Lastdigit of num is : " + lastdigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        lastdigitnum(sc.nextInt());
        sc.close();
    }
}