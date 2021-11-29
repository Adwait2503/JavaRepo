package inheritence;

public class Outdoors extends Sports {

	public void play() {
		System.out.println("Are ment to play Outdoors...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outdoors ou=new Outdoors();
		ou.play();
		System.out.println();
		System.out.println("Outdoor Class Upcasts Sports Class...");
		System.out.println();
		Sports sp=ou;
		sp.play();

	}

}
