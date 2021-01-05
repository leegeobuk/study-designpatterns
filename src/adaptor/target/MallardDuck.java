package adaptor.target;

public class MallardDuck implements Duck {
	String name;
	
	public MallardDuck() {
		
	}
	
	public MallardDuck(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
