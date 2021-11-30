package test;

public class PrimeReturn {

	public static boolean prime(int a) {
		int flag=1;
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				flag=0;
				return  true;
			}
		}
		if (flag==0) {
			return false;	
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		System.out.println("Is Number "+num+" a Prime Number ? :- "+prime(num));
	}

}
