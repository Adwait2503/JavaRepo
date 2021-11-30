package exception;

public class NumberFormat {

	static int n;
	public static void main(String[] args) {
		String s1="a";
		try {
		n=Integer.parseInt(s1);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(s1);
		System.out.println(n);

	}

}
