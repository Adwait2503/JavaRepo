
public class Test_Static {
	
	//static int a;
	static
	{
		test2();
	}
	
	public static void test2() {
		System.out.println("From Test 2");
		test1();
	}
	
	public static void test1() {
		int a=10;
		int b=20;
		System.out.println("From Test 1");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
