package arrayassignments;

public class VarargsInput {

	public static void input(int... a) {
		System.out.println("Address of a => " + a);
		for (int x : a) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VarargsInput varargsInput = new VarargsInput();
		// System.out.println(varargsInput);
		System.out.println("Main Begin...");
		System.out.println();
		VarargsInput.input(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		System.out.println();
		System.out.println("Main End...");
	}

}
