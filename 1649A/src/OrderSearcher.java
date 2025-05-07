import java.util.ArrayList;

public class OrderSearcher {

    public static int binarySearch(ArrayList<Order> orders, int targetOrderId, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            int midOrderId;
            try {
                midOrderId = Integer.parseInt(orders.get(mid).getOrderId());
            } catch (NumberFormatException e) {
                // Handle the case where orderId is not a valid integer
                return -1;
            }

            if (midOrderId == targetOrderId) {
                return mid;
            }
            if (midOrderId > targetOrderId) {
                return binarySearch(orders, targetOrderId, low, mid - 1);
            }
            return binarySearch(orders, targetOrderId, mid + 1, high);
        }
        return -1;
    }
}