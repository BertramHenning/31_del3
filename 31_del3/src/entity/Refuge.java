package entity;

public class Refuge extends Field{
	private int bonus;
	
	public Refuge(int bonus){
		this.bonus = bonus;
		
	}

	@Override
	public void landOnField(Player player) {
		player.addCoins(bonus);
		
	}

	
}
