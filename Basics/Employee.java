package Basics;

public class Employee {
    String name;
    int Emp_id;
    double Salary;
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.name ="Shiva";
        E1.Emp_id =101;
        E1.Salary=53000;
        System.out.println("The Employee id id "+E1.Emp_id+" and the name is "+E1.name+ "  and the salary is "+E1.Salary);
    }
    
}
