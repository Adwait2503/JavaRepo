package abstractprograms;

public class Beverages {

	public static void main(String [] args) {
		ChocolateMilkShake ch=new ChocolateMilkShake();
		ch.type();
		ch.which();
		ch.topings();
		System.out.println();
		System.out.println("Upcasting...");
		System.out.println();
		Cold co=ch;
		co.type();
		co.which();
		System.out.println();
		System.out.println("Upcasting...");
		System.out.println();
		Types ty=co;
		ty.type();
	}
}
