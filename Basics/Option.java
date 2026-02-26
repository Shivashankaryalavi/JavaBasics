package Basics;
public class Option {

    public static void main(String[] args) {
        int a =10;
        switch (a) {
            case 12:
                System.out.println("Hi"); 
                break;
            case 11:
                System.out.println("Hey hi");
            default:
                System.out.println("please select a valuable option");
                break;
        }
    }
}