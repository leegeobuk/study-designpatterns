package adaptor.test;

import adaptor.adaptee.Turkey;
import adaptor.adaptee.TurkeyEnumeration;
import adaptor.adaptee.WildTurkey;
import adaptor.adaptors.EnumerationToIteratorAdaptor;
import adaptor.adaptors.TurkeyToDuckAdaptor;
import adaptor.target.Duck;
import adaptor.target.MallardDuck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
	public static void main(String[] args) {
		Vector<Turkey> tv = new Vector<>();
		tv.add(new WildTurkey("wt1"));
		tv.add(new WildTurkey("wt2"));
		tv.add(new WildTurkey("wt3"));
		tv.add(new WildTurkey("wt4"));
		TurkeyEnumeration te = new TurkeyEnumeration(tv);
		System.out.println("Testing TurkeyEnumeration");
		while (te.hasMoreElements()) {
			System.out.println(te.nextElement());
		}
		
		te = new TurkeyEnumeration(tv);
		EnumerationToIteratorAdaptor enumToIter = new EnumerationToIteratorAdaptor(te);
		System.out.println("\nTesting EnumerationToIteratorAdaptor");
		while (enumToIter.hasNext()) {
			System.out.println(enumToIter.next());
		}
		try {
			enumToIter.remove();
		}
		catch(UnsupportedOperationException uoe) {
			System.out.println(uoe.getMessage());
		}
		
		ArrayList<Duck> ducks = new ArrayList<>();
		ducks.add(new MallardDuck("md1"));
		ducks.add(new MallardDuck("md2"));
		ducks.add(new MallardDuck("md3"));
		ducks.add(new MallardDuck("md4"));
		ducks.add(new MallardDuck("md5"));
		ducks.add(new TurkeyToDuckAdaptor(new WildTurkey("wt1")));
		ducks.add(new TurkeyToDuckAdaptor(new WildTurkey("wt2")));
		ducks.add(new TurkeyToDuckAdaptor(new WildTurkey("wt3")));
		ducks.add(new TurkeyToDuckAdaptor(new WildTurkey("wt4")));
		System.out.println("\nTesting ArrayList with Duck and Turkey");
		Iterator<Duck> it = ducks.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
