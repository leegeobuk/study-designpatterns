package command.drink;

import command.Food;

public class Miranda extends Drink {
    private static final Miranda DRINK = new Miranda(Food.DrinkType.MIRANDA);
    private static int quantity = 1;

    private Miranda(Food.DrinkType type) {
        super(type);
    }

    public static Miranda getDrink() {
        Miranda.quantity = 1;
        return DRINK;
    }

    public static Miranda getDrinks(int quantity) {
        Miranda.quantity = quantity;
        return DRINK;
    }

    @Override
    public void make() {
        System.out.println("Miranda over Fanta!!");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
