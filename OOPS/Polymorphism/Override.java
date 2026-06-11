package OOPS.Polymorphism;

class Father{
    public void house(){
        System.out.println("Blue");
    }
}
class Child extends Father{
    public void house(){
        System.out.println("Navy blue");
    }
}

public class Override {
    public static void main(String[] args) {
       
        Father f1 = new Child();
        f1.house();
    }
    
}
