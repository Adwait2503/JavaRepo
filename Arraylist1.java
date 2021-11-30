package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(10);
		obj.add("Hello");
		ArrayList obj1=new ArrayList();
		obj1.add("hi");
		obj1.add(true);
		System.out.println(obj);
		try {
		System.out.println(obj1.get(3));
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		obj1.addAll(obj);
		System.out.println(obj1);
		Collections.reverse(obj1);
		System.out.println(obj1);
		System.out.println(obj1.size());

	}

}
