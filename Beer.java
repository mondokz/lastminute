package negyes;
import java.io.Serializable;

public class Beer implements Serializable {
	private String name, style;
	private double strength;
	
	
	Beer(String[] cmd){
		name=cmd[1];
		style=cmd[2];
		strength=Double.parseDouble(cmd[3]);
	}
	
	public Beer(String n, String s, double str) {
		name=n;
		style=s;
		strength=str;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStyle() {
		return style;
	}
	
	public double getStrength() {
		return strength;
	}
	
	public String toString() {
		return name + " " + style + " " + strength;
	}
}
