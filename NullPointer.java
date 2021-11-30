package exception;

public class NullPointer {

	public static void main(String[] args) {
		int [] array=null;
		System.out.println("Main Begin");
		try {
		System.out.println(array.length);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer =>"+e);
		}
		System.out.println("Main End");
	}

}
