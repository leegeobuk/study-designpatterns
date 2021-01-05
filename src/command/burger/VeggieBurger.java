package command.burger;

import command.Food;

public class VeggieBurger extends Burger {
    private static final VeggieBurger BURGER = new VeggieBurger(Food.BurgerType.VEGGIE);
    private static int quantity = 1;

    private VeggieBurger(Food.BurgerType type) {
        super(type);
    }

    public static VeggieBurger getBurger() {
        VeggieBurger.quantity = 1;
        return BURGER;
    }

    public static VeggieBurger getBurgers(int quantity) {
        VeggieBurger.quantity = quantity;
        return BURGER;
    }

    @Override
    public void make() {
        System.out.println("Lettuce, tomato, tofu, cucumber, balsamic");
    }
}
