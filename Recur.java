
public class Recur {
	
	public static void rec(int n) {
		int prod=1;
		if(n==6) {
			return;
		}
		prod=prod*n;
		System.out.println(prod);
		n++;
		rec(n);
	}
	
	public static void test() {
		rec(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
