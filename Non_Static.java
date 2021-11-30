
public class Non_Static {

	int a;
	{
		System.out.println("From IIB-1");
		a=20;
		System.out.println(a);
		int a=15;
		System.out.println(a);
		//System.out.println(obj.a);
		System.out.println(this.a);
	}
	{
		System.out.println("From IIB-2");
		System.out.println(a);
		this.a=10;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Non_Static obj=new Non_Static();
		System.out.println(obj);
		System.out.println(obj.a);

	}

}
