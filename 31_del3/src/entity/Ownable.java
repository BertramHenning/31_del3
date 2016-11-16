package entity;

public abstract class Ownable extends Field {

	private int price;
	private Player owner;
	
public Ownable(int price, Player owner){
	this.price=price;
	this.owner=owner;
	
}
	
public abstract int getRent();
	
	
}
