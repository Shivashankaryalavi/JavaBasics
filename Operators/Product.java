package Operators;
public class Product {
    String shoebrand="Nike";
    double shoeprice = 7000;

    public static void main(String[] args) {
        Product p = new Product();
        String shoebrand1 = "PUMA";
        double shoeprice1 = 5000;

        String shoebrand2= "Nike";
        double shoeprice2 = 5500;

        String shoebrand3 = "adidas";
        double shoeprice3 = 4000;

        System.out.println(p.shoebrand.equals(shoebrand1) && p.shoeprice>=shoeprice1 );
        System.out.println(p.shoebrand.equals(shoebrand2) && p.shoeprice>=shoeprice2 );
        System.out.println(p.shoebrand.equals(shoebrand3) && p.shoeprice>=shoeprice3 );



        
    }
}