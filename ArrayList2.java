package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add(8);
		obj.add(9);
		ArrayList obj1=new ArrayList();
		obj1.add("string");
		obj1.add("hi");
		obj1.add('a');
		System.out.println(obj1.retainAll(obj));
		System.out.println(obj.remove("hello"));
		System.out.println(obj);
		

	}

}
