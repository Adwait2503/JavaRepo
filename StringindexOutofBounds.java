package exception;

public class StringindexOutofBounds {

	public static void main(String [] args) {
		String name="Adwait";
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		try {
			System.out.println(name.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringindexOutofBounds =>"+e);
		}
	}
}
