package  Methods;
public class Additions {
    static void add(int a,int b){
        System.out.println(a+b);

    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a, int b,double c,int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        add(10,20);
        add(1,2,3);
        add(1,2,3.0,4);
    }
}