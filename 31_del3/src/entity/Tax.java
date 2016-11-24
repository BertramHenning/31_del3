package entity;

public class Tax extends Field {
	private int taxAmount;
	private int taxRate;

	public Tax(int taxAmount){
		this.taxAmount = taxAmount;
	}
	
	@Override
	public void landOnField(Player player) {
		player.addCoins(taxAmount);
	
	}

}
