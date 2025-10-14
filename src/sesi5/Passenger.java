package sesi5;

public class Passenger {
    protected String name;
    protected int age;
    protected String type;

    public Passenger(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }


    public void displayInfo() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
    }

    public void checkIn() {
        System.out.println(name + " has checked in successfully!");
    }
}
