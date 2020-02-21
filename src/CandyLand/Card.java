package CandyLand;

public class Card {
	
	private String type;
	private String color;
	private String rank;
	
	
	public Card(String type, String color, String rank) {
		this.type = type;
		this.color = color;
		this.rank = rank;
		
	}
	
	public String toString() {
		return "type: " + type + " color: " + color + " rank: " + rank;
	}

}
