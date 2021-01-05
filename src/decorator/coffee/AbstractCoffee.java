package decorator.coffee;

public class AbstractCoffee implements Coffee {
    static String description;
    static double cost;

    protected AbstractCoffee(String description, double cost) {
        AbstractCoffee.description = description;
        AbstractCoffee.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "(" + description + " $" + cost + ")";
    }
}
