package entity;

import java.util.Arrays;

import boundary.Descriptions;

public class GameBoard {
	Field[] fields = new Field[21];
	
	public GameBoard(){
		for (int i = 0; i < 21; i++){
			switch(i){
			case 3:
			case 7:
			case 13:
			case 17:
				fields[i] = new Fleet(1);
				break;
			case 5:
			case 15:
				fields[i] = new Tax(1);
				break;
			case 8:
			case 18:
				fields[i] = new LaborCamp(1, 1);
				break;
			case 10:
			case 20:
				fields[i] = new Refuge(1);
				break;
			default:
				fields[i] = new Territory(1, 1);
				break;
			}
		}
	}

	public String toString() {
		return "GameBoard [fields=" + Arrays.toString(fields) + "] \n";
	}
	
	public Field getField(int position){
		return fields[position];		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
}
