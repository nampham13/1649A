import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderQueue orderQueue = new OrderQueue();

        while (true) {
            System.out.println("\nOrder Management System");
            System.out.println("0. Find Products");
            System.out.println("1. Add Order");
            System.out.println("2. Process Order");
            System.out.println("3. View and Search Orders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    function0.displayMenu(scanner);
                    break;
                case 1:
                    function1.processOrder(scanner, orderQueue);
                    break;
                case 2:
                    function2.processOrder(orderQueue);
                    break;
                case 3:
                    System.out.print("Enter Order ID to search: ");
                    int targetOrderId = scanner.nextInt();
                    function3.viewAndSearchOrders(orderQueue, targetOrderId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}