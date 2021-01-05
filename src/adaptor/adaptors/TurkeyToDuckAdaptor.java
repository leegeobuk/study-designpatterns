package adaptor.adaptors;

import adaptor.adaptee.Turkey;
import adaptor.target.Duck;

public class TurkeyToDuckAdaptor implements Duck {
	Turkey turkey;
	
	public TurkeyToDuckAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
		turkey.fly();
	}
	
	@Override
	public String toString() {
		return turkey.toString();
	}
}
