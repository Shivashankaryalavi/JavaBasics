package Basics;


    class Employee {

    String name;          
    int id;               
    static String company = "Infosys";  
    
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Company       : " + company);
        System.out.println("******************");
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "ShivaBasava";
        e1.id = 101;

        Employee e2 = new Employee();
        e2.name = "Shivashankar";
        e2.id = 102;

        e1.display();
        e2.display();
    }
}

    

