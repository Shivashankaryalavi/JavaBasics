package ConstructorPrograms;

public class Chaining {

    String name;

    Chaining(){
             this("shivu");
             System.out.println("Shivanand");
    }
    Chaining(String name){

        System.out.println(name);

    }
    public static void main(String[] args) {
        Chaining c = new Chaining();
    }
}
