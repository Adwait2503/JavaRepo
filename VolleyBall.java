package object;

public class VolleyBall {

	public static void main(String [] args) {
		Teams t1=new Teams("Brazil", 1);
		Teams t2=new Teams("Poland", 2);
		Teams t3=new Teams("Russia", 3);
		System.out.println("Volleyball Mens Rankings");
		System.out.println();
		System.out.println(t1.toString()+" it's Rank is "+t1.hashCode());
		System.out.println();
		System.out.println(t2.toString()+" it's Rank is "+t2.hashCode());
		System.out.println();
		System.out.println(t3.toString()+" it's Rank is "+t3.hashCode());
	}
}
