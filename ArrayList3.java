package arraylist;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(false);
		a.add('a');
		a.add(12.0231);
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		System.out.println(a);
		a.add(2,true);
		System.out.println(b.add(a));
		System.out.println(b);
		ArrayList c=new ArrayList();
		System.out.println(c.isEmpty());

	}

}
