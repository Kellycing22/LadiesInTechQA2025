package sesi5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Passenger> passengers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("==============================");
            System.out.println("   Welcome to Flight System   ");
            System.out.println("==============================");
            System.out.println("1. Add Passenger");
            System.out.println("2. See Passenger List");
            System.out.println("3. Delete Passenger");
            System.out.println("4. Exit");
            System.out.print("Choose (1-4): ");


            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a number (1-4): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPassenger();
                    break;
                case 2:
                    viewPassengers();
                    break;
                case 3:
                    deletePassenger();
                    break;
                case 4:
                    System.out.println("Thank you for using Flight System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }


    private static void addPassenger() {
        System.out.println("Enter passenger name: ");
        String name = scanner.nextLine();

        System.out.println("Enter passenger age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select passenger type:");
        System.out.println("1. First Class");
        System.out.println("2. Business Class");
        System.out.println("3. Economy Class");
        System.out.print("Choose (1-3): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        Passenger p = switch (typeChoice) {
            case 1 -> new FirstClassPassenger(name, age);
            case 2 -> new BusinessClassPassenger(name, age);
            case 3 -> new EconomyPassenger(name, age);
            default -> {
                System.out.println("Invalid class type! Defaulting to Economy.");
                yield new EconomyPassenger(name, age);
            }
        };

        passengers.add(p);
        System.out.println("Passenger successfully added!");
    }


    private static void viewPassengers() {
        System.out.println("=== Passenger List ===");

        if (passengers.isEmpty()) {
            System.out.println("No passengers yet!");
            return;
        }

        int index = 1;
        for (Passenger p : passengers) {
            System.out.println(index++ + ".");
            p.displayInfo();
        }
    }


    private static void deletePassenger() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers to delete!");
            return;
        }

        viewPassengers();
        System.out.print("Enter passenger number to delete: ");
        int delIndex = scanner.nextInt();
        scanner.nextLine();

        if (delIndex > 0 && delIndex <= passengers.size()) {
            Passenger removed = passengers.remove(delIndex - 1);
            System.out.println("Passenger " + removed.name + " deleted successfully.");
        } else {
            System.out.println("Invalid index!");
        }
    }
}
