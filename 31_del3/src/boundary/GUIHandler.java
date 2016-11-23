package boundary;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class GUIHandler {
	

	
	public void createBoard(){
		Field[] fields = new Field[21];
		
		for (int i = 0; i < 21; i++){
			switch(i){
			case 3:
			case 7:
			case 13:
			case 17:
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldPrice[i])
						.build();
				break;
			case 5:
			case 15:
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldPay[i])
						.build();
				break;
			case 8:
			case 18:
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldPrice[i])
						.build();
				break;
			case 10:
			case 20:
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldReceive[i])
						.build();
				break;
			default:
				fields[i] = new Street.Builder().setBgColor(Descriptions.fieldColor[i])
						.setDescription(Descriptions.fieldDescription[i])
						.setTitle(Descriptions.fieldNames[i])
						.setSubText("" + Descriptions.fieldPrice[i])
						.build();
				break;
			}
		}
		
		GUI.create(fields);
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
