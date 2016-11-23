package entity;

public class Player {

	private int position, laborcamps = 0, fleets = 0;
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

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getLaborcamps() {
		return laborcamps;
	}

	public void setLaborcamps(int laborcamps) {
		this.laborcamps = laborcamps;
	}

	public int getFleets() {
		return fleets;
	}

	public void setFleets(int fleets) {
		this.fleets = fleets;
	}

	public String toString() {
		return name;
	}

}