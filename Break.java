
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		while (a<4) {
			System.out.println("Hey");
			if (a==2) {
				System.out.println("Hello "+a);
				break;
			}
			System.out.println("hi "+a);
			a++;
			//break;
		}
		System.out.println("Execution Over");
	}

}
