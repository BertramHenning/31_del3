package entity;

import boundary.Descriptions;
import desktop_resources.GUI;

public class Refuge extends Field{
	private int bonus;
	
	public Refuge(int bonus){
		this.bonus = bonus;
		
	}

	@Override
	public void landOnField(Player player) {
		GUI.showMessage(Descriptions.fieldDescription[player.getPosition()-1]);
		player.addCoins(bonus);
		
	}

	
}
