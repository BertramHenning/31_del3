package boundary;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class GUIHandler {
	

	
	public void createBoard(){
		Field[] fields = new Field[21];
		
		for (int i = 0; i < 21; i++){
				fields[i] = new Street.Builder() //.setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldValue[i])
						.build();
		}
		
		GUI.create(fields);
	}
	
	public void setDice(int a, int b){
		GUI.setDice(a, b);
	}
	
	public void addPlayer(String name){
		GUI.addPlayer(name, 30000);
	}
	
	public void removeCar(String name){
		GUI.removeAllCars(name);
	}
	
	
	
	public void moveCar(String name, int position){
		GUI.removeAllCars(name);
		GUI.setCar(position, name);
	}
	
	public void displayBalance(String name, int balance){
		GUI.setBalance(name, balance);
	}
	
	public void showMessage(String message){
		GUI.showMessage(message);
	}
	
	public boolean askPlayer(String message){
		return GUI.getUserLeftButtonPressed(message, "Ja", "Nej");
	}

}
