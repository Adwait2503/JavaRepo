
public class Laptop {

	public static String processor(int a) {
		System.out.println("This Laptop has "+a+" Core and has RAM "+ram());
		return "Dual Core";
	}
	public static boolean os() {
		System.out.println("It Has Windows 10 OS");
         battery();
		return true;
	}
	public static int ram() {
		System.out.println("Ram is Extensible upto 32 Gb");
		System.out.println(os());
//		System.out.println(battery());
		return 8;
	}
	public static void battery() {
		System.out.println("Battery lasts upto 4 Hrs");
		
	}
	public static char modleName(String s1) {
		System.out.println("The Procerssor of the Laptop is "+processor(2));
		char ch='A';
		os();
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Begin");
		modleName("VivoBook");
		System.out.println("Main Ends");

	}

}
