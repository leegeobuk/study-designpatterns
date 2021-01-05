package decorator.condiment;

import decorator.coffee.Coffee;

public interface Condiment extends Coffee {

    void setCoffee(Coffee coffee);
}
