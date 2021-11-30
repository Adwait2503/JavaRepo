package object;

public class AniDetails {

	String Name;
	int Seasons,Episodes;
	AniDetails() {
	
	}
	AniDetails(String name,int se0,int epi){
		this.Name=name;
		this.Seasons=se0;
		this.Episodes=epi;
	}
	public String toString() {
		return "Original Address -: "+super.toString()+" Created Address -: "+Name;
	}
	public int hashCode() {
		return Seasons;
	}
	public boolean equals(Object obj) {
		boolean var=false;
		if (this.Name==(((AniDetails)obj).Name) && this.Seasons==((AniDetails)obj).Seasons) {
			return true;
		}
		return false;
	}
}
