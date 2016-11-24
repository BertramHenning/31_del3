package entity;

import desktop_resources.GUI;

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

	@Override
	public void landOnField(Player player) {
		if (owner == null && player.getCoins() > price) {
			if (GUI.getUserLeftButtonPressed("Do you want to purchase this territory for " + price + "?", "Yes", "No")) {
				owner = player;
				player.addCoins(-price);
			}
		} else if (owner == null) {
			GUI.showMessage("You dont have enough coins to buy this territory");
		} else {
			GUI.showMessage(
					"You have landed on " + owner.toString() + "'s territory and have to pay him " + rent + "coins");
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
