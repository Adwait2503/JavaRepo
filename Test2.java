package oops;

public class Test2 {

	Test2(String str){
		System.out.println(str);
	}
	 static int a;
	static {
		System.out.println("Hi...");
	}
	{
		int a=10;
		System.out.println(a);
		this.a=20;
		System.out.println("NSIB");
		System.out.println(a);
	}
	public static int fact(int n) {
		int fact=1;
		if (n==1) {
			return 1;
		}
		return fact=n*fact(--n);
		}
	public static void main(String[] args) {
		Test2 obj =new Test2("Sunday");
		System.out.println(obj);
		System.out.println(obj.fact(5));
		System.out.println(obj.a);
		
	}

}
