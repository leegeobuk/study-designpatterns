package adaptor.adaptee;

public class WildTurkey implements Turkey {
	String name;
	
	public WildTurkey() {
		
	}
	
	public WildTurkey(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("Fly short. Fluck!");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
