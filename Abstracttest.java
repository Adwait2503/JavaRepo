package oops;

public abstract class Abstracttest {

	int b=10;
	static int a;
	{
		System.out.println(b);
		System.out.println("From IIB...");
	}
	static {
		System.out.println(a);
		System.out.println("SIB...");
	}
	public Abstracttest() {
		// TODO Auto-generated constructor stub
		System.out.println("Abstracttest()");
	}
	abstract public void test();
	public static void demo() {
		System.out.println("Demo()...");
	}
	public static void main(String [] args) {
	
		demo();
	}
}
