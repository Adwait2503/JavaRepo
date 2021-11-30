
public class MainOverloading {

	public static void main(int num) {
		System.out.println(num);
	}
	public static void main(double d) {
		System.out.println(d);
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		main('d');
		main(12.35f);
		System.out.println("Main End");

	}

}
