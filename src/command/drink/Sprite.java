package command.drink;

import command.Food;

public class Sprite extends Drink {
    private static final Sprite DRINK = new Sprite(Food.DrinkType.SPRITE);
    private static int quantity = 1;

    private Sprite(Food.DrinkType type) {
        super(type);
    }

    public static Sprite getDrink() {
        Sprite.quantity = 1;
        return DRINK;
    }

    public static Sprite getDrinks(int quantity) {
        Sprite.quantity = quantity;
        return DRINK;
    }

    @Override
    public void make() {
        System.out.println("Sprite over cider!!");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
