package ARRAYS;
import java.util.Scanner;
public class TwoD_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][3];
        System.out.println("Enter matrix elements :");
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array matrix is :");
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%02d" , a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}