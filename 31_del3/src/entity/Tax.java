package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

public class Tax extends Field {
	private int taxAmount;
	private int taxRate = 10;

	public Tax(int taxAmount){
		this.taxAmount = taxAmount;
	}
	
	@Override
	public void landOnField(Player player) {
		if (taxAmount == 2000){
			GUI.showMessage(Descriptions.fieldDescription[player.getPosition()-1]);
			player.addCoins(-taxAmount);
		} else {
			if (GUI.getUserLeftButtonPressed(Descriptions.fieldAsk[player.getPosition()-1], "" + taxAmount, "" + player.getCoins()/100*taxRate)){
				player.addCoins(-taxAmount);	
			} else {
				player.addCoins(-player.getCoins()/100*taxRate);
			}
		}
	
	}

}
