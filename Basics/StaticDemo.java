package Basics;
import java.util.*;
public class StaticDemo{
    static int a =10;
    public static void main(String[] args){
        int a =20;
        int b =30;
        System.out.println(a);
        System.out.println(StaticDemo.a);
        System.out.println(b);

    }
}