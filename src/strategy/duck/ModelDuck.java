package strategy.duck;

import strategy.fly.FlyInDreams;
import strategy.quack.QuackMute;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyInDreams();
		quackBehavior = new QuackMute();
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
