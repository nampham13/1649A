public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int quantityInStock;

    public Book(int id, String title, String author, double price, int quantityInStock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + title + " by " + author + " - $" + price + " (" + quantityInStock + " in stock)";
    }
}