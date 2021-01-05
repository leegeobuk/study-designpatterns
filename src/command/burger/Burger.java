package command.burger;

import command.Food;
import command.Menu;

public abstract class Burger implements Menu {
    private Food.BurgerType type;

    Burger(Food.BurgerType type) {
        this.type = type;
    }

    @Override
    public abstract void make();

    @Override
    public String toString() {
        String s = type.toString();
        return s.charAt(0) + s.substring(1).toLowerCase() + " burger ";
    }
}
