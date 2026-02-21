package Methods;
import java.util.Scanner;
public class SquareNumber {

    public static int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
  
        System.out.println(square(n));
        sc.close();

    }
}