package basics;

public class A1 {

	public static void test() {
		int a=10,b=20;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main...");
		test();
		System.out.println("Main End...");

	}

}
