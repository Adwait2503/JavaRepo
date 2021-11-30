package oops;

public class Croma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ps5 ps=new Ps5();
		ps.use();
		ps.gamming();
		ps.types();
		ps.work();
		System.out.println();
		Console co=ps;
		co.gamming();
		co.types();
		co.work();
		System.out.println();
		Categories cat=co;
		cat.types();
		cat.work();
		System.out.println();
		Devices dev=cat;
		dev.work();

	}

}
