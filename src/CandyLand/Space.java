package CandyLand;

public class Space {
	private String type;
	private String color;
	private String rank;
	private int location;
	
	
	public Space(String type, String color, String rank, int location) {
		this.type = type;
		this.color = color;
		this.rank = rank;
		this.location = location;
		
	}
	 
	public String toString() {
		return "type: " + type + " color: " + color + " rank: " + rank + "location : " + location;
	}
}


//draw --> where i will go, Space will have onLanding();