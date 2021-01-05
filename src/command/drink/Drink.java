package command.drink;

import command.Food;
import command.Menu;

public abstract class Drink implements Menu {
    private Food.DrinkType type;

    Drink(Food.DrinkType type) {
        this.type = type;
    }

    @Override
    public abstract void make();

    @Override
    public String toString() {
        String s = type.toString();
        return s.charAt(0) + s.substring(1).toLowerCase() + " ";
    }
}
