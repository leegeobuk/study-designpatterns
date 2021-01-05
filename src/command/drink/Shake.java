package command.drink;

import command.Food;

public class Shake extends Drink {
    private static final Shake DRINK = new Shake(Food.DrinkType.SHAKE);
    private static int quantity = 1;

    private Shake(Food.DrinkType type) {
        super(type);
    }

    public static Shake getDrink() {
        Shake.quantity = 1;
        return DRINK;
    }

    public static Shake getDrinks(int quantity) {
        Shake.quantity = quantity;
        return DRINK;
    }

    @Override
    public void make() {
        System.out.println("Shake shake shake!!!");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
