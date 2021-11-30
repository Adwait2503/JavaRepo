package treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSettoTreeSet {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(8);
		a.add(12);
		a.add(25);
		a.add(9);
		a.add(2);
		a.add(25);
		a.add(8);
		System.out.println(a);
		TreeSet b=new TreeSet(a);
		System.out.println(b);

	}

}
