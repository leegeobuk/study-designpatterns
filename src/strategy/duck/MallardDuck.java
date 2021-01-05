package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
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
