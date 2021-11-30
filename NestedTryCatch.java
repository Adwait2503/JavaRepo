package exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("Main Begin");
		int a=12,b=0,res=0;
		String str="Dragon";
		try {
		try {
			System.out.println(str.charAt(8));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(res=a/b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Main End");
	}

}
