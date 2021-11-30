package vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector obj=new Vector();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(10);
		obj.add("Hello");
		Vector obj1=new Vector();
		obj1.add("hi");
		obj1.add(true);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		obj1.addAll(obj);
		System.out.println(obj1);
		System.out.println(obj1.size());

	}

}
