/**
 * Concrete command
 */
public class PizzaOrder implements Order {

    private PizzaChef chef;

    public PizzaOrder() {
        this.chef = new PizzaChef();
    }

    @Override
    public void execute() {
        chef.makePizza();
    }

    @Override
    public String toString() {
        return "pizza";
    }

}
