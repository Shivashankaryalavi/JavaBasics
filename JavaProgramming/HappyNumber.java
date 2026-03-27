package JavaProgramming;
import java.util.Scanner;
public class HappyNumber {

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);              // 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is NOT a Happy Number");
        }
    }
}