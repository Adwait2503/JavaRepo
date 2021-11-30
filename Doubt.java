
public class Doubt {
	
	public static boolean os()
	{
		System.out.println("OS executed");
		String res1=process();
		System.out.println("My process status is "+res1);
		return true;
	}
	
	public static String process()
	{
		System.out.println("process executed ");
		int res=battery('d');
		System.out.println("battery is "+res);
		return "under process";
	}
	
	public static int battery(int a)
	{
		System.out.println("battery executed ");
	   return a;
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
	    boolean res2=os();
	    System.out.println("OS is "+res2);
	}

}
