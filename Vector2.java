package vector;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector obj=new Vector();
		obj.add(10);
		obj.add(8);
		obj.add(9);
		obj.add("string");
		obj.add(2);
		obj.add(1);
		System.out.println(obj.remove("hello"));
		System.out.println(obj);
	}
}
