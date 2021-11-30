package treeset;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet <Integer>a=new TreeSet<Integer>();
		a.add(1);
		a.add(13);
		a.add(5);
		TreeSet<Integer> b=new TreeSet<Integer>();
		b.add(-10);
		b.add(97);
		b.add(23);
		b.add(5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		Iterator j=b.iterator();
		while(j.hasNext()) {
		System.out.println(j.next());
		}

	}

}
