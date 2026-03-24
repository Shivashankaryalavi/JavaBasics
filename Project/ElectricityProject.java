import java.sql.*;
import java.util.Scanner;

public class ElectricityProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units: ");
        int units = sc.nextInt();

        int originalUnits = units;   // 🔥 IMPORTANT

        double bill = 0;

        if (units > 300) {
            bill += (units - 300) * 5;
            units = 300;
        }
        if (units > 200) {
            bill += (units - 200) * 3;
            units = 200;
        }
        if (units > 100) {
            bill += (units - 100) * 2;
            units = 100;
        }
        if (units > 0) {
            bill += units * 1;
        }

        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Units: " + originalUnits);
        System.out.println("Total Bill: " + bill);
        try {
    Class.forName("oracle.jdbc.driver.OracleDriver");

    Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe",
        "system",
        "tiger"
    );

    System.out.println("Connected to Oracle!");

    con.close();

} catch (Exception e) {
    System.out.println(e);
}

        sc.close();
    }
}