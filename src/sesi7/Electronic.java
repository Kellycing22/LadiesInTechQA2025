package sesi7;

public class Electronic extends Product{
    private String brand;

    public Electronic(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getProductDetails() {
        return String.format("Electronic: %s (%s) - $%.2f", name, brand, price);
    }
}
