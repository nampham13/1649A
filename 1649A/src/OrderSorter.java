import java.util.ArrayList;

public class OrderSorter {

    public static void quickSort(ArrayList<Order> orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Order> orders, int low, int high) {
        String pivot = orders.get(high).getBook().getTitle(); // Pivot: Book title
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders.get(j).getBook().getTitle().compareToIgnoreCase(pivot) <= 0) {
                i++;
                swap(orders, i, j);
            }
        }
        swap(orders, i + 1, high);
        return i + 1;
    }

    private static void swap(ArrayList<Order> orders, int i, int j) {
        Order temp = orders.get(i);
        orders.set(i, orders.get(j));
        orders.set(j, temp);
    }
}