import java.util.Scanner;

public class function0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu(scanner);
    }

    public static void displayMenu(Scanner scanner) {
        System.out.println("Please select:");
        System.out.println("1. List All products");
        System.out.println("2. Search for products");
        System.out.print("Choose an option: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        if (subChoice == 1) {
            System.out.println("All products:");
            BookDataset.getSampleBooks().forEach(book -> System.out.println(book));
        } else if (subChoice == 2) {
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
                }
            } else {
                System.out.println("Invalid product ID. Please enter a valid number.");
                scanner.nextLine();
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
