package sesi5;

public class EconomyPassenger extends Passenger{
    private String mealService = "Standard Meal";

    public EconomyPassenger(String name, int age) {
        super(name, age, "Economy Class");
    }

    @Override
    public void displayInfo(){
        System.out.println("=== ECONOMY PASSENGER ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Seat Type: " + type);
        System.out.println("Meal Service: " + mealService);
        System.out.println();
    }
}
