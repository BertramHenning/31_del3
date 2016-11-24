package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

public class LaborCamp extends Ownable {

	private int baseRent;
	
	public LaborCamp(int price,int baseRent){
		super(price);
		this.baseRent = baseRent;
	}
	
	@Override
	public int getRent() {

		return 0;
	}
	
	@Override
	public void landOnField(Player player) {
		if (owner == null && player.getCoins() > price) {
			if (GUI.getUserLeftButtonPressed(Descriptions.fieldAsk[player.getPosition() - 1], "Yes", "No")) {
				owner = player;
				player.addCoins(-price);
				player.setLaborcamps(player.getLaborcamps()+1);
			}
		} else if (owner == null) {
			GUI.showMessage("You dont have enough coins to buy this labor camp");
		} else if (owner == player) {
			GUI.showMessage("You have landed on your own labor camp");
		} else {
			int rent = owner.getLaborcamps() * baseRent * player.getDiceSum();
			GUI.showMessage("You have landed on " + owner.toString() + "'s labor camp and have to pay him " + rent + " coins");
			if (player.getCoins() > rent) {
				player.addCoins(-rent);
				owner.addCoins(rent);
			} else {
				owner.addCoins(player.getCoins());
				player.addCoins(-rent);
			}
		}
	}
	

}
