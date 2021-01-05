package strategy.duck;

import strategy.fly.FlyPretend;
import strategy.quack.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyPretend();
		quackBehavior = new Squeak();
	}
	@Override
	public void performFly() {
		flyBehavior.fly();
	}

	@Override
	public void performQuack() {
		quackBehavior.quack();
	}

}
