package strategy.test;

import strategy.duck.*;
import strategy.fly.FlyLikeRockets;
import strategy.quack.QuackLikeLion;

public class TestStrategy {
	public static void main(String[] args) {
		Duck md = new MallardDuck();
		md.performFly();
		md.performQuack();
		
		Duck rd = new RubberDuck();
		rd.performFly();
		rd.performQuack();
		
		Duck mod = new ModelDuck();
		mod.performFly();
		mod.performQuack();
		mod.setFly(new FlyLikeRockets());
		mod.setQuack(new QuackLikeLion());
		mod.performFly();
		mod.performQuack();
	}
}
