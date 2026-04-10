package OOPS;
class Animalds {
    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
interface Pet {
    void play();
}
interface Friendly {
    void behave();
}
class Puppy extends Dog implements Pet, Friendly {
    public void play() {
        System.out.println("Puppy plays");
    }

    public void behave() {
        System.out.println("Puppy is friendly");
    }
}
public class HybridExample {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();     
        p.bark();     
        p.play();     
        p.behave();   
    }
}