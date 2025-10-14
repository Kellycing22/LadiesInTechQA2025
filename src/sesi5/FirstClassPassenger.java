package sesi5;

public class FirstClassPassenger extends Passenger{
    private String loungeAccess = "Yes";
    private String mealService = "Premium Meal";

    public FirstClassPassenger(String name, int age) {
        super(name, age, "First Class");
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("=== FIRST CLASS PASSENGER ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Seat Type: " + type);
        System.out.println("Lounge Access: " + loungeAccess);
        System.out.println("Meal Service: " + mealService);
        System.out.println();
    }
}
