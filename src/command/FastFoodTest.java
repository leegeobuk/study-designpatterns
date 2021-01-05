package command;

import command.burger.*;
import command.commands.BurgerOnCommand;
import command.commands.Command;
import command.commands.DrinkOnCommand;
import command.drink.Coke;
import command.drink.Drink;
import command.drink.Sprite;

public class FastFoodTest {
    public static void main(String[] args) {
        Burger beefBurger = BeefBurger.getBurger();
        Burger fishBurger = FishBurger.getBurgers(5);
        Burger cheeseBurger = CheeseBurger.getBurgers(3);
        Command command1 = new BurgerOnCommand(beefBurger, fishBurger, cheeseBurger);

        Drink coke = Coke.getDrink();
        Drink sprite = Sprite.getDrinks(10);
        Command command2 = new DrinkOnCommand(coke, sprite);

        Order order = new Order(command1, command2);
        order.order();
        System.out.println(order);
    }
}
