package wrapperclass;

public class BoxingWrapper {
	
	public static void main(String[] args) {
		byte a=12;
		Byte b=Byte.valueOf(a);
		System.out.println("Primitive =>"+a);
		System.out.println("Non-Primitive =>"+b);
		System.out.println();
		short c=123;
		Short d=Short.valueOf(c);
		System.out.println("Primitive =>"+c);
		System.out.println("Non-Primitive =>"+d);
		System.out.println();
		long e=12345;
		Long f=Long.valueOf(e);
		System.out.println("Primitive =>"+e);
		System.out.println("Non-Primitive =>"+f);
		System.out.println();
		float g=23.42f;
		Float h=Float.valueOf(a);
		System.out.println("Primitive =>"+g);
		System.out.println("Non-Primitive =>"+h);
		System.out.println();
		double i=123.6457;
		Double j=Double.valueOf(i);
		System.out.println("Primitive =>"+i);
		System.out.println("Non-Primitive =>"+j);
		System.out.println();
		boolean k=true;
		Boolean l=Boolean.valueOf(k);
		System.out.println("Primitive =>"+k);
		System.out.println("Non-Primitive =>"+l);
		System.out.println();
		char m='A';
		Character n=Character.valueOf(m);
		System.out.println("Primitive =>"+m);
		System.out.println("Non-Primitive =>"+n);
	}

}
