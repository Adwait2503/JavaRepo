
package encapsulation;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1=new Employees("Mahadev", 246, 3.6);
		System.out.println(e1.getEsal());
		//System.out.println(e1.Esal);
		e1.setEsal(5.7);
		System.out.println(e1.getEsal());

	}

}
