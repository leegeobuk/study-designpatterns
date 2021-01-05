package decorator.coffee;

public class Espresso extends AbstractCoffee {
    private static final String DESCRIPTION = "Espresso";
    private static final double COST = 1.99;
    private static final Espresso COFFEE = new Espresso(DESCRIPTION, COST);

    private Espresso(String description, double cost) {
        super(description, cost);
    }

    public static Espresso getCoffee() {
        return COFFEE;
    }
}
