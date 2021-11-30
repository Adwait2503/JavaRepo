package object;

public class Movie {

	public static void main(String [] args) {
		Details det=new Details("Free Guy", "Ryan Reynolds", "Taika Waititi");
		Details det1=new Details("Green Lantern", "Ryan Reynolds", "Taika Waititi");
		System.out.println(det);
		System.out.println(det1);
		System.out.println(det.equals(det1));
	}
}
