package entity;

public class Player {

	private int current;
	private String name;

	private Account points;

	public Player(String a) {
		name = a;
		points = new Account();
	}
	
	// Adds score to Account object
	public void addPoints(int a) {
		points.addCoins(a);
	}

	// Gets score from Account object
	public int getPoints() {
		return points.getCoins();
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public String toString() {
		return name;
	}

}