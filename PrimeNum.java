import java.util.Iterator;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,flag=1;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag=0;
				System.out.println(n+" is not a Prime Number.");
				break;
			}
		}
			if (flag==1 && n!=1) {
				System.out.println(n+" is a Prime Number.");
			}
	}

}
