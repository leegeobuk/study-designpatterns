package decorator.coffee;

public class HouseBlend extends AbstractCoffee {
    private static final String DESCRIPTION = "House blend";
    private static final double COST = .89;
    private static final HouseBlend COFFEE = new HouseBlend(DESCRIPTION, COST);

    private HouseBlend(String description, double cost) {
        super(description, cost);
    }

    public static HouseBlend getCoffee() {
        return COFFEE;
    }
}
