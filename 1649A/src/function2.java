public class function2 {
    public static void processOrder(OrderQueue orderQueue) {
        if (!orderQueue.isEmpty()) {
            Order processedOrder = orderQueue.dequeue();
            System.out.println("Processing order: " + processedOrder);

            // Calculate the money
            int quantity = processedOrder.getQuantity();
            double pricePerUnit = processedOrder.getPricePerUnit();
            double totalMoney = calculateMoney(quantity, pricePerUnit);

            System.out.println("Total money for the order: $" + totalMoney);
        } else {
            System.out.println("No orders to process.");
        }
    }

    // Define the calculateMoney method
    public static double calculateMoney(int quantity, double pricePerUnit) {
        return quantity * pricePerUnit;
    }
}