package exception;

public class ArrayindexOutofBounds {

	public static void main(String[] args) {
		int [] array=new int[4];
		System.out.println(array.length);
		try {
		System.out.println(array[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}

	}

}
