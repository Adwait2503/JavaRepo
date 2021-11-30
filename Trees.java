package oops;

public class Trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango man=new Mango();
		man.taste();
		System.out.println();
		System.out.println("Mango Upcasts Fruits");
		System.out.println();
		Fruits fr=man;
		fr.taste();
	}
}
