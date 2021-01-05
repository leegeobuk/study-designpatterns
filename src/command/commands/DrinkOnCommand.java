package command.commands;

import command.drink.Drink;

import java.util.Arrays;

public class DrinkOnCommand implements Command {
    private Drink[] drinks;

    public DrinkOnCommand(Drink... drinks) {
        this.drinks = drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    @Override
    public void execute() {
        for (Drink drink : drinks) {
            drink.make();
        }
    }

    @Override
    public String toString() {
        String drink = Arrays.toString(drinks);
        return drink.substring(1, drink.length() - 1);
    }
}
