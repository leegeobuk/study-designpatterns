package adaptor.test;

import adaptor.adaptee.WildTurkey;
import adaptor.adaptors.TurkeyToDuckAdaptor;
import adaptor.target.Duck;
import adaptor.target.MallardDuck;

public class DuckTurkeyTest {
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		WildTurkey wt = new WildTurkey();
		Duck turkeyAdapter = new TurkeyToDuckAdaptor(wt);
		
		System.out.println("Turkey says...");
		wt.gobble();
		wt.fly();
		
		System.out.println("\nDuck says...");
		testDuck(md);
		
		System.out.println("\nTurkeyToDuckAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
