package exception;

public class DrivingLicense {

	public static void goKart(int a) throws Eligible{
		if(a<7) {
			throw new Eligible("Too Young For Go Karting");
		}else {
			System.out.println("Eligible For Kart License...");
		}
	}
	public static void formula1(int a) throws Eligible{
		if(a<18) {
			throw new Eligible("Not Eligible For Licensing!");
		}else {
			System.out.println("Eligible For Formula 1 License...");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Hello Everyone");
		try {
		try {
		goKart(6);
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		formula1(17);
		}
		catch (Throwable e) {
			System.out.println(e);
		}
		System.out.println("Have A Nice Day...");

	}

}
