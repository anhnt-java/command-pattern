/**
 * Concrete command
 */
public class SteakOrder implements Order {

    private SteakChef chef;

    public SteakOrder() {
        this.chef = new SteakChef();
    }

    @Override
    public void execute() {
        chef.makeSteak();
    }

    @Override
    public String toString() {
        return "steak";
    }

}
