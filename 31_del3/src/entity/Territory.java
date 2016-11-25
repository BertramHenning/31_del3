package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

/**
 * A type of field called a territory
 */
public class Territory extends Ownable {
	private int rent;

	public Territory(int price, int rent) {
		super(price);
		this.rent = rent;
	}

	@Override
	public int getRent() {
		return rent;
	}

	/**
	 * Does what happens on a territory field based on the owner and the player that landed there
	 */
	@Override
	public void landOnField(Player player) {
		if (owner == null && player.getCoins() > price) {
			//Lets the player buy the field if there is no owner and the player has enough coins
			if (GUI.getUserLeftButtonPressed(Descriptions.fieldAsk[player.getPosition() - 1], "Yes",
					"No")) {
				owner = player;
				player.addCoins(-price);
			}
		} else if (owner == null) {
			GUI.showMessage("You dont have enough coins to buy this territory");
		} else if (owner == player) {
			GUI.showMessage("You have landed on your own territory");
		} else {
			//Takes coins from the player and gives them to the owner
			GUI.showMessage(
					"You have landed on " + owner.toString() + "'s territory and have to pay him " + rent + " coins");
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
