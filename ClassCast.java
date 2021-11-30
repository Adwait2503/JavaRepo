package exception;

public class ClassCast {

	public static void main(String[] args) {
		P1 p=new P1();
		System.out.println("Begin");
		try {
		P2 P=(P2)p;
		}
		catch(ClassCastException e) {
			System.out.println("ClassCast =>"+e);
		}
		System.out.println("End");	
	}
}
