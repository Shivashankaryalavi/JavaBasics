package OOPS;


class Animal{
    String name;
    String color;
    double price;
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog)a;
        d.sound();
        System.out.println(d.color="Brown");
        System.out.println(d.name="Browny");
        System.out.println(d.price=10000);

    }
    
}
