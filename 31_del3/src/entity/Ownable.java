package entity;

public abstract class Ownable extends Field {

	private int price;
	private Player owner;
	
public Ownable(int price){
	this.price = price;
	this.owner = null;
	
}
	
public abstract int getRent();
	
	
}
