package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

/**
 * A type of field called a refuge
 */
public class Refuge extends Field{
	private int bonus;
	
	public Refuge(int bonus){
		this.bonus = bonus;
		
	}

	/**
	 * Does what happens on a refuge field based on the owner and the player that landed there
	 */
	@Override
	public void landOnField(Player player) {
		GUI.showMessage(Descriptions.fieldDescription[player.getPosition()-1]);
		player.addCoins(bonus);
		
	}

	
}
