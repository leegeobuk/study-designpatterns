package command;

import command.commands.Command;

import java.util.Arrays;

public class Order {
    private Command[] commands;
    private static int order_no = 0;

    public Order(Command... commands) {
        this.commands = commands;
    }

    public Order setCommands(Command... commands) {
        this.commands = commands;
        return this;
    }

    public void order() {
        order_no++;
        for (Command c : commands) {
            c.execute();
        }
    }

    @Override
    public String toString() {
        String s = "Order No." + String.format("%04d", order_no) + "\n ";
        String com = Arrays.toString(commands);
        return "[" + s + com.substring(1, com.length() - 1) + "]";
    }
}
