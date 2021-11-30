package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListtoHashSet {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(23);
		a.add(12);
		a.add(43);
		a.add(15);
		System.out.println(a);
		HashSet b=new HashSet(a);
		System.out.println(b);

	}

}
