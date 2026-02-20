package ARRAYS;
import java.util.Scanner;
public class takeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int r = sc.nextInt();
        System.out.println("enter a number of columns ");
        int c = sc.nextInt();
        int arr[][]= new int[r][c];
        System.out.println("Enter a elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
        }

    }
    System.out.println("Matrix is:");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();

}
}