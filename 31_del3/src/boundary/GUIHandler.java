package boundary;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


/**
 * Communicates with the GUI for the controller
 */
public class GUIHandler {
	
	
	/**
	 * Creates the board on the GUI with information from Descriptions
	 */
	public void createBoard(){
		Field[] fields = new Field[21];
		
		for (int i = 0; i < 21; i++){
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldValue[i])
						.build();
		}
		
		GUI.create(fields);
	}
	
	/**
	 * Places 2 dice on the GUI
	 */
	public void setDice(int a, int b){
		GUI.setDice(a, b);
	}
	
	/**
	 * Adds a player to the GUI
	 */
	public void addPlayer(String name){
		GUI.addPlayer(name, 30000);
	}
	
	/**
	 * Removes a car from the GUI
	 */
	public void removeCar(String name){
		GUI.removeAllCars(name);
	}
	
	/**
	 * Moves a car on the GUI
	 */
	public void moveCar(String name, int position){
		GUI.removeAllCars(name);
		GUI.setCar(position, name);
	}
	
	/**
	 * Displays the players balance on the GUI
	 */
	public void displayBalance(String name, int balance){
		GUI.setBalance(name, balance);
	}
	
	/**
	 * Shows a message on the GUI
	 */
	public void showMessage(String message){
		GUI.showMessage(message);
	}
	
	/**
	 * Asks the player a yes or no question on the GUI
	 */
	public boolean askTrueFalse(String message){
		return GUI.getUserLeftButtonPressed(message, "Yes", "No");
	}

	/**
	 * Asks the player for an amount on the GUI
	 */
	public int askAmount(String message, int min, int max){
		return GUI.getUserInteger(message, min, max);
	}

	/**
	 * Asks the player for a string on the GUI
	 */
	public String askString(String message){
		return GUI.getUserString(message);
	}

}
