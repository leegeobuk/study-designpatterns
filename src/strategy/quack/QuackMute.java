package strategy.quack;

public class QuackMute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Mute");
	}

}
