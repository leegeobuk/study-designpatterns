package command.commands;

import command.burger.Burger;

import java.util.Arrays;

public class BurgerOnCommand implements Command {
    private Burger[] burgers;

    public BurgerOnCommand(Burger... burgers) {
        this.burgers = burgers;
    }

    public void setBurgers(Burger[] burgers) {
        this.burgers = burgers;
    }

    @Override
    public void execute() {
        for (Burger burger : burgers) {
            burger.make();
        }
    }

    @Override
    public String toString() {
        String burger = Arrays.toString(burgers);
        return burger.substring(1, burger.length() - 1);
    }
}
