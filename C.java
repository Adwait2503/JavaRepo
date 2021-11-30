package oops;

import org.w3c.dom.xpath.XPathNamespace;

public class C extends B {

	C(){
		super('a');
		System.out.println("C()");
	}
	C(int a){
		super(10.567);
		System.out.println(a);
	}
	C(double b){
		super();
		System.out.println(b);
	}
}
