package abstractprograms;

public class Anime {

	public static void main(String [] args) {
		System.out.println("Abstraction with Hierarchy and Multilevel");
		System.out.println();
		System.out.println("Anime has -->");
		ReleaseDate rd=new ReleaseDate();
		rd.name();
		rd.date();
		System.out.println();
		System.out.println("Upcasting...");
		System.out.println();
		AnimeName an=rd;
		an.name();
		System.out.println();
		System.out.println("Child Class SubGenre...");
		SubGenre sg=new SubGenre();
		sg.name();
		sg.genre();
		sg.subGenre();
		System.out.println();
		System.out.println("Upcasting...");
		System.out.println();
		Genre ge=sg;
		ge.genre();
		ge.name();
		System.out.println();
		System.out.println("Upcasting...");
		System.out.println();
		AnimeName ann=ge;
		ann.name();
		
	}
}
