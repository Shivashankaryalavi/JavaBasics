package conditionals;
import java.util.*;

public class Salary_Bonus_generator {
    public static void main(String[] args) {
        double bonus =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Employe name :");
        String name = sc.nextLine();
        System.out.println("Enter a Salary :");
        double salary = sc.nextDouble();
        if(salary < 0){
            System.out.println("Invalid Salary, Please add a proper salary");
            return;
        }
        if(salary>50000){
            bonus = salary*0.2;
        }
        else if(salary > 20000){
            bonus = salary *0.15;
        }
        else{
            bonus = salary*0.10;

        }
     
        System.out.println("\n_ _ _ _ Salary Details _ _ _ _");
        System.out.println("Employee name  :" + name);
        System.out.println("Salary         :" + salary);
        System.out.println("Bonus          :" + bonus);
        System.out.println("Final salary   :" +  (bonus+salary));
        sc.close();
        

    }
    
}
