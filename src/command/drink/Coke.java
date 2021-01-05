package command.drink;

import command.Food;

public class Coke extends Drink {
    private static final Coke DRINK = new Coke(Food.DrinkType.COKE);
    private static int quantity = 1;

    private Coke(Food.DrinkType type) {
        super(type);
    }

    public static Coke getDrink() {
        quantity = 1;
        return DRINK;
    }

    public static Coke getDrinks(int quantity) {
        Coke.quantity = quantity;
        return DRINK;
    }

    @Override
    public void make() {
        System.out.println("Coca cola!");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
