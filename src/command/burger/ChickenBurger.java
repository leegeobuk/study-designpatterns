package command.burger;

import command.Food;

public class ChickenBurger extends Burger {
    private static final ChickenBurger BURGER = new ChickenBurger(Food.BurgerType.CHICKEN);
    private static int quantity = 1;

    private ChickenBurger(Food.BurgerType type) {
        super(type);
    }

    public static ChickenBurger getBurger() {
        ChickenBurger.quantity = 1;
        return BURGER;
    }

    public static ChickenBurger getBurgers(int quantity) {
        ChickenBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, chicken, mustard");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
