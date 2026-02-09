package Basics;

public class Laptop {
    String ram = "8GB";
 int price = 75000;
    String color = "Black";
    String brand = "HP Victus";
    int processor = 64;

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        System.out.println(l1.ram);
        System.out.println(l1.price);
        System.out.println(l1.color);
        System.out.println(l1.brand);
        System.out.println(l1.processor);
      
    }
    
}
