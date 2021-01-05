package decorator.condiment;

import decorator.coffee.Coffee;

public class Whip extends AbstractCondiment {
    private static final String DESCRIPTION = "whip";
    private static final double COST = .35;

    public Whip(Coffee coffee) {
        super(DESCRIPTION, COST, coffee);
    }
}
