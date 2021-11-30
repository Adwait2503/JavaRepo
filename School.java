package oops;

public class School {
	public static void main(String[] args) 
	{
		Student s1=new Student("Souma",01,78.21,300000);
		Student s2=new Student("Kazuma",02,58.96,420000);
		System.out.println("Donation");
		System.out.println(s1.getDonations());
		s1.setDonation(500000);
		System.out.println("New Donation");
		System.out.println(s1.getDonations());
		s1.study();
		s1.display();
	}

}
