package oops;

public class Student {
	String Sname;
	int Srno;
	double Sperce;
	private double Donations;

	Student()
	{
		
	}
	Student(String name,int Rno,double perce,double donate)
	{
		this.Sname=name;
		this.Srno=Rno;
		this.Sperce=perce;
		this.Donations=donate;
	}
	public double getDonations()
	{
		return this.Donations;
	}
	public void setDonation(double donate)
	{
	 this.Donations=donate;
	}
	public void study()
	{
	 System.out.println(Sname +" is studying.");	
	}
	public void display()
	{
	System.out.println("Student Name is :"+ Sname);
	System.out.println("Student Rollno. is :"+ Srno);
	System.out.println("Student Percentage is :"+ Sperce);
	System.out.println("Donated Amount :"+ Sperce);
	}
}


