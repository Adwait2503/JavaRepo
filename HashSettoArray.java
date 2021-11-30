package hashset;

import java.util.HashSet;

public class HashSettoArray {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(12);
		a.add(23);
		a.add(12);
		a.add(43);
		a.add(15);
		System.out.println(a);
		Object [] b=a.toArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
