package sesi2;

public class contohcase {
    public static void main(String[] args) {
        int wheels = 4;
        String vehicle;

        switch (wheels) {
            case 2:
                vehicle = "Motorcycle or Bicycle";
                break;
            case 3:
                vehicle = "Tuk-tuk or Bajaj";
                break;
            case 4:
                vehicle = "Car";
                break;
            case 6:
                vehicle = "Truck";
                break;
            case 8:
                vehicle = "Bus or Heavy Truck";
                break;
            default:
                vehicle = "Unknown type of vehicle";
                break;
        }

        System.out.println("Number of wheels: " + wheels);
        System.out.println("Vehicle type: " + vehicle);
    }
}
