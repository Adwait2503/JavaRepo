
public class Overloading {
	
	public static void add(int a,int b) {
		int res=a+b;
		System.out.println(res);
	}
	
	public static void add(double a,int b) {
		double res=a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(12,52);
		add(23.24,54);
		add('a','B'); //97,66

	}

}
