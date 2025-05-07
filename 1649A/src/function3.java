import java.util.ArrayList;

public class function3 {

    public static void viewAndSearchOrders(OrderQueue orderQueue, int targetOrderId) {
        // Convert the queue to an ArrayList for sorting and searching
        ArrayList<Order> orders = new ArrayList<>(orderQueue.getQueue());

        // Sort the orders by book title
        OrderSorter.quickSort(orders, 0, orders.size() - 1);

        // Display sorted orders
        System.out.println("Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Search for the target order ID
        int index = OrderSearcher.binarySearch(orders, targetOrderId, 0, orders.size() - 1);
        if (index != -1) {
            System.out.println("Order found: " + orders.get(index));
        } else {
            System.out.println("Order with ID " + targetOrderId + " not found.");
        }
    }
}