package entity;

/**
 * A superclass to the fields players can own
 */
public abstract class Ownable extends Field {

	protected int price;
	protected Player owner;

	public Ownable(int price) {
		this.price = price;
		this.owner = null;

	}

	public abstract int getRent();

}
