package exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		String Char="Rimuru Tempest";
		System.out.println(Char);
		System.out.println(Char.length());
		System.out.println(Char.charAt(8));
		try {
			System.out.println(Char.charAt(14));
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
