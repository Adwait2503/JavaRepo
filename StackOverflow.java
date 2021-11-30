package exception;

public class StackOverflow {

	static int count;
	public static void main(String[] args) throws StackOverflowError {
		System.out.println("Hello "+count++);
		try {
		main(null);
	
		}catch (Error e) {
			System.out.println(e);
			System.out.println(count);
		}
		System.out.println("Hello World");
	}

}
