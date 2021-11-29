package assignments;

public class Recurr {

	public int recur(int x) {
		int prod=x;
		if (x==1) {
			return 1;
		}
		return prod=x*recur(--x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Recurr re=new Recurr();
		System.out.println(re.recur(n));

	}

}
