package command.burger;

import command.Food;

public class HamBurger extends Burger {
    private static final HamBurger BURGER = new HamBurger(Food.BurgerType.HAM);
    private static int quantity = 1;

    private HamBurger(Food.BurgerType type) {
        super(type);
    }

    public static HamBurger getBurger() {
        HamBurger.quantity = 1;
        return BURGER;
    }

    public static HamBurger getBurgers(int quantity) {
        HamBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, ham, ketchup");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
