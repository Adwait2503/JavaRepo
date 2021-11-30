package object;

public class DeviceName {

	String Dname;
	int Dram;
	DeviceName() {
		
	}
	DeviceName(String name, int ram ){
		this.Dname=name;
		this.Dram=ram;
	}
	public String toString() {
		return super.toString()+" "+Dname+" is the Device Name and it's Ram is "+Dram+"Gb";
	}
}
