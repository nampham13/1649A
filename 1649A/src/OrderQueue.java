import java.util.LinkedList;
import java.util.List;

public class OrderQueue {
    private LinkedList<Order> queue;

    public OrderQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Order order) {
        queue.addLast(order); // Add new orders to the back
    }

    public Order dequeue() {
        return queue.pollFirst(); // Get and remove from the front
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void displayQueue() {
        for (Order order : queue) {
            System.out.println(order);
        }
    }

    public List<Order> getQueue() {
        return queue;
    }
}