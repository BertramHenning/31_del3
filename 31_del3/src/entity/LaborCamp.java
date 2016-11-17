package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	public LaborCamp(int price, Player owner,int baseRent){
		super(price,owner);
		this.baseRent = baseRent;
	}
	
	@Override
	public int getRent() {

		return 0;
	}
	
	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub

	}
	

}
