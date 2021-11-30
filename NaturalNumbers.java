package exception;

public class NaturalNumbers {

	public static void number(int a) throws InvalidDefinition {
		if (a<0) {
			throw new InvalidDefinition(a+" is Not a Natural Number...");
		} else {
			System.out.println("The Number "+a+" is a Natural Number...");
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Begin...");
		//try {
		number(-10);
		//}
		/*catch (Exception e) {
			System.out.println(e);
		}*/
		System.out.println("Main End...");
	}

}
