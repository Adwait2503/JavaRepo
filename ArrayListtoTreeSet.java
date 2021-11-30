package treeset;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListtoTreeSet {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(23);
		a.add(12);
		a.add(43);
		a.add(15);
		System.out.println(a);
		TreeSet b=new TreeSet(a);
		System.out.println(b);

	}

}
