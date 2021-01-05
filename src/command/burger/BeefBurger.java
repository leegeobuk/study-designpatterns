package command.burger;

import command.Food;

public class BeefBurger extends Burger {
    private static final BeefBurger BURGER = new BeefBurger(Food.BurgerType.BEEF);
    private static int quantity = 1;

    private BeefBurger(Food.BurgerType type) {
        super(type);
    }

    public static BeefBurger getBurger() {
        quantity = 1;
        return BURGER;
    }

    public static BeefBurger getBurgers(int quantity) {
        BeefBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, beef, ketchup");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
