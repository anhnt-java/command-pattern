import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class Waiter {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
        System.out.println("Waiter take new order " + order);
    }

    public void placeOrders() {
        orders.forEach(Order::execute);
        orders.clear();
    }

}
