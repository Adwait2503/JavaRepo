package assignments;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass class1 = new ChildClass();
		class1.drink();
		class1.eat();
		class1.sleep();
		System.out.println("=========================");
		System.out.println("Upcasting");
		System.out.println();
		Abstraction ab = class1;// upcasting
		ab.drink();
		ab.eat();
		ab.sleep();
		Abstraction.test();
		System.out.println(Abstraction.x);
	}

}
