package assignments;

public class MethodOverloadingNumberOfArgs {
	public static void add(int x, int y) {
		System.out.println(x + y);
	}

	public static void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}
public static void name(int x) {
	System.out.println(x);
}
public static void name(double x) {
	System.out.println(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2, 3);
		add(5, 6, 7);
		name('a');
	}

}
