package OOPS.CLASS;


class Employee{
    int id;
    void action(){
        System.out.println("Employee works");
    }
}
class Developer extends Employee{
    void action(){
        super.action();
        super.id= 101;
        System.out.println("Developer works");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.action();
        System.out.println(d.id);

    }
    
}
