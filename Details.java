package object;

public class Details {

	String Mname,Actor,Cast;
	Details(){
		
	}
	Details(String name,String act,String cast){
		this.Mname=name;
		this.Actor=act;
		this.Cast=cast;
	}
	public String toString() {
		return Mname;
	}
	public boolean equals(Object obj) {
		boolean var=false;
		if (this.Actor==((Details)obj).Actor && this.Cast==((Details)obj).Cast){
			return true;
		}
		return var;
	}
}
