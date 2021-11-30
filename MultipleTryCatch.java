package exception;

public class MultipleTryCatch {

	public static void main(String[] args) {
		String str="Here We Go Again";
		int [] arr=null;
		try {
			System.out.println(arr.length);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(str);
		System.out.println(str.length());
		try {
			System.out.println(str.charAt(16));
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
