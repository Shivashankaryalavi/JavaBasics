/*Write a program to find out  whether a student is pass or fail; if it requires total 40% and atleast 33% in each subject to pass.Assume 3 subjects and take marks as an input from the user
 */
package conditionals;
import java.util.*;
public class Condition {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a marks of sub1 :");
        byte sub1 = sc.nextByte();
        System.out.println("Enter a marks of sub2:");
        byte sub2 = sc.nextByte();
        System.out.println("Enter a marks of sub3:");
        byte sub3 = sc.nextByte();
        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println(" your overall percentage is " +avg);
        
        if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("You are passed and promoted");
        }
        else{
            System.out.println("Sorry you are not promoted");
        }
      
    }
}