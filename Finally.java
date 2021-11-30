package exception;

public class Finally {

	public static void main(String[] args) {
		String str="Hello World";
		System.out.println("Main Begin");
		try {
			System.out.println(str.charAt(20));
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Main End");

	}

}
