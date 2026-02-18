import java.util.Scanner;

public class BankManagementSystem {

    static String username = "";
    static String pin = "";
    static int balance = 25000;
    static boolean isLoggedIn = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createAccount(sc);
                    break;

                case 2:
                    login(sc);
                    break;

                case 3:
                    withdraw(sc);
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    // ✅ CREATE ACCOUNT
    static void createAccount(Scanner sc) {

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();

        if (age < 18) {
            System.out.println("You must be 18+ to create an account.");
            return;
        }

        System.out.println("Create username:");
        username = sc.nextLine();

        System.out.println("Enter mobile number:");
        String mobile = sc.nextLine();

        if (!mobile.matches("\\d{10}")) {
            System.out.println("Invalid mobile number.");
            return;
        }

        System.out.println("Set 4-digit PIN:");
        pin = sc.nextLine();

        if (!pin.matches("\\d{4}")) {
            System.out.println("Invalid PIN.");
            pin = "";
            return;
        }

        System.out.println("✅ Account created successfully!");
    }

    // ✅ LOGIN
    static void login(Scanner sc) {

        if (username.isEmpty()) {
            System.out.println("Create an account first.");
            return;
        }

        System.out.println("Enter username:");
        String enteredUser = sc.nextLine();

        System.out.println("Enter PIN:");
        String enteredPin = sc.nextLine();

        if (enteredUser.equals(username) && enteredPin.equals(pin)) {
            isLoggedIn = true;
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    // ✅ WITHDRAW
    static void withdraw(Scanner sc) {

        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("✅ Withdrawal successful!");
    }

    // ✅ BALANCE
    static void checkBalance() {

        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }

        System.out.println("Current balance: ₹" + balance);
    }
}
