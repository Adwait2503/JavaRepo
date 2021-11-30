package object;

public class Teams {

	String Country;
	int Rank;
	Teams(){
		
	}
	Teams(String cont,int rank){
		this.Country=cont;
		this.Rank=rank;
	}
	public String toString() {
		return "Country -: "+Country;
	}
	public int hashCode() {
		return Rank;
	}
}
