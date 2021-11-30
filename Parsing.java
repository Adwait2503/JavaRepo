package wrapperclass;

public class Parsing {

	public static void main(String[] args) {
		String str="10";
		int a=Integer.parseInt(str);
		int b=Integer.valueOf(str);
		System.out.println(a);
		System.out.println(b);
		String str1="1";
		short sh=Short.parseShort(str1);
		System.out.println(str1);
		System.out.println(sh);
		String str2="21.234";
		double d=Double.parseDouble(str2);
		System.out.println(str2);
		System.out.println(d);
		String str3="21.45";
		float fl=Float.parseFloat(str3);
		System.out.println(str3);
		System.out.println(fl);
		String str4="true";
		boolean bo=Boolean.parseBoolean(str4);
		System.out.println(str4);
		System.out.println(bo);
		String str5="1200";
		long lo=Long.parseLong(str5);
		System.out.println(str5);
		System.out.println(lo);
		String str6="1";
		byte by=Byte.parseByte(str6);
		System.out.println(str6);
		System.out.println(by);
		

	}

}
