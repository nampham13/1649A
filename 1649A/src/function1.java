import java.util.InputMismatchException;
import java.util.Scanner;

public class function1 {
    public static void processOrder(Scanner scanner, OrderQueue orderQueue) {
        try {
            String orderId = String.valueOf(orderQueue.size() + 1);

            System.out.print("Enter product ID: ");
            if (scanner.hasNextInt()) {
                int productId = scanner.nextInt();
                scanner.nextLine();

                Book selectedBook = BookDataset.getSampleBooks().stream()
                    .filter(book -> book.getId() == productId)
                    .findFirst()
                    .orElse(null);
                if (selectedBook == null) {
                    System.out.println("Product not found. Please enter a valid product ID.");
                } else {
                    System.out.println("Selected Book: " + selectedBook);

                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter quantity: ");
                    if (scanner.hasNextInt()) {
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        if (quantity <= 0 || quantity > selectedBook.getQuantityInStock()) {
                            if (quantity <= 0) {
                                System.out.println("Invalid quantity. Quantity must be greater than zero.");
                            } else {
                                System.out.println("Insufficient stock. Available quantity: " + selectedBook.getQuantityInStock());
                            }
                        } else {
                            // Debug print before updating quantity
                            System.out.println("Before update: " + selectedBook);

                            // Adjust the quantity in the dataset
                            selectedBook.setQuantityInStock(selectedBook.getQuantityInStock() - quantity);

                            // Debug print after updating quantity
                            System.out.println("After update: " + selectedBook);
                    
                            Order order = new Order(orderId, customerName, selectedBook, quantity);
                            orderQueue.enqueue(order);
                            System.out.println("Order created successfully with ID: " + orderId);
                        }
                    } else {
                        System.out.println("Invalid quantity. Please enter a valid number.");
                        scanner.nextLine();
                    }
                }
            } else {
                System.out.println("Invalid product ID. Please enter a valid number.");
                scanner.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            scanner.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}