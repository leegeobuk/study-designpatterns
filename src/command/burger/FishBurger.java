package command.burger;

import command.Food;

public class FishBurger extends Burger {
    private static final FishBurger BURGER = new FishBurger(Food.BurgerType.FISH);
    private static int quantity = 1;

    private FishBurger(Food.BurgerType type) {
        super(type);
    }

    public static FishBurger getBurger() {
        FishBurger.quantity = 1;
        return BURGER;
    }

    public static FishBurger getBurgers(int quantity) {
        FishBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, fish, mayo");
    }

    @Override
    public String toString() {
        return super.toString() + quantity;
    }
}
