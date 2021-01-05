package decorator.condiment;

import decorator.coffee.Coffee;

public class Mocha extends AbstractCondiment {
    private static final String DESCRIPTION = "mocha";
    private static final double COST = .20;

    public Mocha(Coffee coffee) {
        super(DESCRIPTION, COST, coffee);
    }
}
