package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	public LaborCamp(int price, Player owner,int baseRent){
		super(price,owner);
		this.baseRent = baseRent;
	}
	
	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
