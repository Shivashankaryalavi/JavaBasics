package JavaProgramming;
import java.util.Scanner;
public class EvilNumber {
    public static String evil(int num){
        String binaryres=" ";
        while(num>0){
            int bin = num%2;
            binaryres=binaryres+bin;
            num/=2;
        }
        return binaryres;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String res = evil(num);
        int count =0;
        for(int i =0;i<res.length();i++){
            if(res.charAt(i)=='1'){
                    count++;
            }
        }
        if(count%2==0){
            System.out.println("Evil Number");
        }
        else{
            System.out.println("Not Evil Number");
        }
        sc.close();

    }
}