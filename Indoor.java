package inheritence;

public class Indoor extends Sports {

	public void play() {
		System.out.println("Are ment to play Indoors...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indoor in=new Indoor();
		in.play();
		System.out.println();
		System.out.println("Indoor Class Upcasts Sports Class...");
		System.out.println();
		Sports sp=in;
		sp.play();

	}

}

