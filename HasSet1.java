package hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HasSet1 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(8);
		a.add(12);
		a.add(25);
		HashSet b=new HashSet();
		b.add(9);
		b.add(2);
		b.add(25);
		b.add(8);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		b.retainAll(a);
		System.out.println(b);
	}

}
