package strategy.quack;

public class QuackLikeLion implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Lion's roar!!!");
	}

}
