package oops;

public class B extends A{

	B(){
		super();
		System.out.println("From B()");
	}
	B(double c){
		super();
		System.out.println(c);
	}
	B(char ch){
		super(10, 10.123f);
	}

}
