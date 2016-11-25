package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

/**
 * A type of field called a Tax
 */
public class Tax extends Field {
	private int taxAmount;
	private int taxRate = 10;

	public Tax(int taxAmount){
		this.taxAmount = taxAmount;
	}
	
	/**
	 * Does what happens on a tax field based on the player that landed there
	 */
	@Override
	public void landOnField(Player player) {
		if (taxAmount == 2000){
			// Takes coins from the player
			GUI.showMessage(Descriptions.fieldDescription[player.getPosition()-1]);
			player.addCoins(-taxAmount);
		} else {
			// Lets the player choose if they want to lose 4000 coins or 10% of their coins
			if (GUI.getUserLeftButtonPressed(Descriptions.fieldAsk[player.getPosition()-1], "" + taxAmount, "" + player.getCoins()/100*taxRate)){
				player.addCoins(-taxAmount);	
			} else {
				player.addCoins(-player.getCoins()/100*taxRate);
			}
		}
	
	}

}
