package entity;

public class Dice {

	private int value;

	public Dice() {
		value = 6;
	}

	// Randomizes value from 1-6
	public void roll() {
		float d1 = (float) Math.random();
		float d2 = d1 * 6;
		int d3 = (int) d2;
		value = d3 + 1;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
