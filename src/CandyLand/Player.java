package CandyLand;

public class Player {
	private String name;
	private int location;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(int location) {
		this.location = location;
	}
	
	public boolean isWinner() {
		return true;
	}
	
	public String displayWinner() {
		return "You win!";
	}
	
	
}
