package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

/**
 * A type of field called a fleet
 */
public class Fleet extends Ownable {
	
	private final int RENT_1 = 500;
	private final int RENT_2 = 1000;
	private final int RENT_3 = 2000;
	private final int RENT_4 = 4000;
	
	
	public Fleet(int price){
		super(price);
		
	}
	/**
	 * Does what happens on a fleet field based on the owner and the player that landed there
	 */
	@Override
	public void landOnField(Player player) {
		if (owner == null && player.getCoins() > price) {
			//Lets the player buy the field if there is no owner and the player has enough coins
			if (GUI.getUserLeftButtonPressed(Descriptions.fieldAsk[player.getPosition() - 1], "Yes", "No")) {
				owner = player;
				player.addCoins(-price);
				player.setFleets(player.getFleets()+1);
			}
		} else if (owner == null) {
			GUI.showMessage("You dont have enough coins to buy this fleet");
		} else if (owner == player) {
			GUI.showMessage("You have landed on your own fleet");
		} else {
			//Takes coins from the player and gives them to the owner based on the owners amount of fleets
			int rent;
			switch(owner.getFleets()){
			case 1:
				rent = RENT_1;
				break;
			case 2:
				rent = RENT_2;
				break;
			case 3:
				rent = RENT_3;
				break;
			case 4:
				rent = RENT_4;
				break;
			default:
				rent = 0;
			}
			GUI.showMessage("You have landed on " + owner.toString() + "'s fleet and have to pay him " + rent + " coins");
			if (player.getCoins() > rent) {
				player.addCoins(-rent);
				owner.addCoins(rent);
			} else {
				owner.addCoins(player.getCoins());
				player.addCoins(-rent);
			}
		}
	}

	@Override
	public int getRent() {
		return 0;
	}
	
	
	
	
	
	
	
	
	

}
