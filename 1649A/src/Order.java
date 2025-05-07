public class Order {
    private String orderId;
    private String customerName;
    private Book book;
    private int quantity;
    private double pricePerUnit;

    // Constructor that matches the parameters
    public Order(String orderId, String customerName, Book book, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.book = book;
        this.quantity = quantity;
        this.pricePerUnit = book.getPrice(); // Assuming Book has a getPrice() method
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return "Order{quantity=" + quantity + ", pricePerUnit=" + pricePerUnit + "}";
    }
}