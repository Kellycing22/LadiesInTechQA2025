package sesi7;

public class Book extends Product{
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getProductDetails() {
        return String.format("Book: %s by %s - $%.2f", name, author, price);
    }
}
