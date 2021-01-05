package adaptor.adaptors;

import adaptor.adaptee.Turkey;
import adaptor.adaptee.TurkeyEnumeration;
import java.util.Iterator;

public class EnumerationToIteratorAdaptor implements Iterator<Turkey> {
	TurkeyEnumeration te;
	
	public EnumerationToIteratorAdaptor(TurkeyEnumeration te) {
		this.te = te;
	}
	
	@Override
	public boolean hasNext() {
		return te.hasMoreElements();
	}

	@Override
	public Turkey next() {
		return te.nextElement();
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Doesn't support remove function!");
	}
}
