package encapsulation;

public class Employees {

	String Ename;
	int Eid;
	private double Esal;
	Employees(){
		
	}
	Employees(String Name,int Id,double Sal){
		this.Ename=Name;
		this.Eid=Id;
		this.Esal=Sal;
	}
	public void work() {
		System.out.println(Ename+" is Working...");
	}
	public double getEsal() {
		return Esal;
	}
	public void setEsal(double Sal) {
		this.Esal=Sal;
	}
}
