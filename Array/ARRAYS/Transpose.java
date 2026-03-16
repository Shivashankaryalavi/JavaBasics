package ARRAYS;
import java.util.Scanner;

public class Transpose {
    public static int[][] transpose(int[][] arr){
    int[][] b = new int[arr[0].length][arr.length];
    for(int i =0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            b[j][i]=arr[i][j];
        }
    }
    return b;
}
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row and column size");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter array elements");
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int[][] result = transpose(arr);
        System.out.println("Resultant  Transpose Matrix");
        for(int i =0;i<result.length;i++){
            for(int j =0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            
           
            }
            System.out.println();
        }
        sc.close();


    }
}