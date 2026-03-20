package Basics;

public class StaticInitializer {
    static int a = 10;
    static{
        System.out.println("Hello ");
    }
    static{
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        System.out.println("Bye");
        System.out.println(a);
        
    }
}
