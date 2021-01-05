package command.burger;

import command.Food;

public class CheeseBurger extends Burger {
    private static final CheeseBurger BURGER = new CheeseBurger(Food.BurgerType.CHEESE);
    private static int quantity = 1;

    private CheeseBurger(Food.BurgerType type) {
        super(type);
    }

    public static CheeseBurger getBurger() {
        CheeseBurger.quantity = 1;
        return BURGER;
    }

    public static CheeseBurger getBurgers(int quantity) {
        CheeseBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, 2 pickles, ketchup, cheese, patty");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
