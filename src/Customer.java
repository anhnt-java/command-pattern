/**
 * Client
 */
public class Customer {

    private Waiter waiter;

    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void request(String request) {
        Order order;
        if (request.toLowerCase().equals("pizza")) {
            order = new PizzaOrder();
        } else {
            order = new SteakOrder();
        }
        waiter.takeOrder(order);
    }

}
