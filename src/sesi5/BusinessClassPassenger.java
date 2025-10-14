package sesi5;

public class BusinessClassPassenger extends Passenger{
    private String loungeAccess = "Limited";
    private String mealService = "Business Meal";

    public BusinessClassPassenger(String name, int age) {
        super(name, age, "Business Class");
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("=== BUSINESS CLASS PASSENGER ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Seat Type: " + type);
        System.out.println("Lounge Access: " + loungeAccess);
        System.out.println("Meal Service: " + mealService);
        System.out.println();
    }
}
