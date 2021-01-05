package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void performFly();
	
	public abstract void performQuack();
	
	public void setFly(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuack(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void display() {
		System.out.println("Display duck.");
	}
	
	public void swim() {
		System.out.print("Duck swimming.");
	}
}
