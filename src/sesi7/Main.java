package sesi7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("=== Welcome to the Store ===");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. View All Products");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    viewProducts();
                    break;
                case 4:
                    System.out.println("Thank You For Using the System");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 4);
    }

    static void addProduct() {
        System.out.println("Select Product Type:");
        System.out.println("1. Book");
        System.out.println("2. Electronic");
        System.out.print("Choice: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        if (type == 1) {
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            products.add(new Book(name, price, author));
        } else if (type == 2) {
            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();
            products.add(new Electronic(name, price, brand));
        } else {
            System.out.println("Invalid product type!");
        }

        System.out.println("Product added successfully!");
    }

    static void deleteProduct() {
        if (products.isEmpty()) {
            System.out.println("No products to delete!");
            return;
        }

        viewProducts();
        System.out.print("Enter product number to delete: ");
        int index = scanner.nextInt();

        if (index > 0 && index <= products.size()) {
            Product removed = products.remove(index - 1);
            System.out.println(removed.getName() + " deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        System.out.println("=== Product List ===");
        int i = 1;
        for (Product p : products) {
            System.out.println(i++ + ". " + p.getProductDetails());
        }
    }
}
