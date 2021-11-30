package test;

public class EvenCount {

	public static int count(int a,int b) {
		int count=0;
		for(int i=a;i<b;i++) {
			if (i%2==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=40;
		System.out.println("The Number of Even Numbers between "+num1+" and "+num2+" are :-"+count(num1,num2));

	}

}
