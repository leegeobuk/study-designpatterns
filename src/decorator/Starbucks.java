package decorator;

import decorator.coffee.Coffee;
import decorator.coffee.Espresso;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;

public class Starbucks {
    public static void main(String[] args) {
        Coffee plainEspresso = Espresso.getCoffee();
        Coffee mochaEspresso = new Mocha(plainEspresso);
        Coffee whipEspresso = new Whip(plainEspresso);

        System.out.println("plainEspresso: " + plainEspresso);
        System.out.println("mochaEspresso " + mochaEspresso);
        System.out.println("whipEspresso " + whipEspresso);

        Coffee mochaWhipEspresso = new Whip(mochaEspresso);
        System.out.println("mochaWhipEspresso: " + mochaWhipEspresso);
    }
}
