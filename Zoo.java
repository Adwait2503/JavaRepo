package abstractprograms;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		System.out.println("Upcasting...");
		Animal a=d;
		a.eat();

	}

}
