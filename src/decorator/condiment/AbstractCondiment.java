package decorator.condiment;

import decorator.coffee.Coffee;

public class AbstractCondiment implements Condiment {
    String description;
    double cost;
    Coffee coffee;

    AbstractCondiment(String description, double cost, Coffee coffee) {
        this.description = description;
        this.cost = cost;
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + description;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + cost;
    }

    @Override
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "(" + getDescription() + " $" + getCost() + ")";
    }
}
