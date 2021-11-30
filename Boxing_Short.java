package wrapperclass;

public class Boxing_Short {

	public static void main(String[] args) {
		short a=123;
		Short b=Short.valueOf(a);
		System.out.println("Primitive =>"+a);
		System.out.println("Non-Primitive =>"+b);

	}

}
