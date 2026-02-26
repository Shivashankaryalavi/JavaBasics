package Basics;
public class largest {

    public static void main(String[] args) {
        int a = 10;
        int b=26;
        int c=45;
        int largest =(a>b) ?((a>c)?a:c):((b>c)?b:c);
        System.out.println(largest);
    }
}