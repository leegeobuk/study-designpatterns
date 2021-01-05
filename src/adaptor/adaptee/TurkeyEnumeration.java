package adaptor.adaptee;

import java.util.Enumeration;
import java.util.Vector;

public class TurkeyEnumeration implements Enumeration<Turkey> {
	Vector<Turkey> tv;
	int index;
	
	public TurkeyEnumeration(Vector<Turkey> tv) {
		this.tv = tv;
	}
	
	@Override
	public boolean hasMoreElements() {
		return index < tv.size();
	}

	@Override
	public Turkey nextElement() {
		Turkey t = tv.elementAt(index);
		index++;
		return t;
	}	
}
