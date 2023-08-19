package application;

import java.util.Scanner;

public class RestaurantSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static int stock = 0;
    private static double cash = 0;

    public static void main(String[] args) {
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Please enter your username: ");
            String username = scanner.nextLine();
            System.out.println("Please enter your password: ");
            String password = scanner.nextLine();

            if (checkCredentials(username, password)) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        boolean running = true;
        while (running) {
            System.out.println("Please select an option:");
            System.out.println("1. Manage stock");
            System.out.println("2. Manage orders");
            System.out.println("3. Cash register");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    manageStock();
                    break;
                case 2:
                    manageOrders();
                    break;
                case 3:
                    cashRegister();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static boolean checkCredentials(String username, String password) {
        // Check if the username and password match the stored credentials
        // Return true if they match, false otherwise
        // You can implement your own logic here
        return true;
    }

    private static void manageStock() {
        System.out.println("Current stock: " + stock);
        System.out.println("Enter the quantity to add or subtract from stock: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        stock += quantity;
        System.out.println("Stock updated. New stock: " + stock);
    }

    private static void manageOrders() {
        // Implement the logic to manage orders here
    }

    private static void cashRegister() {
        System.out.println("Current cash: $" + cash);
        System.out.println("Enter the amount to add or subtract from cash: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        cash += amount;
        System.out.println("Cash updated. New cash: $" + cash);
    }
}