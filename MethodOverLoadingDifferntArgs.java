package assignments;

public class MethodOverLoadingDifferntArgs {
	public static void login(String username, String password) {
		System.out.println("Your Username is " + username);
		System.out.println("Your Password is " + password);
	}

	public static void login(long phno, String password) {
		System.out.println("Ph No. is " + phno);
		System.out.println("Your Password is " + password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("Demon25", "blackpearl");
		System.out.println();
		login(8698178196l, "blackpearl");
	}

}
