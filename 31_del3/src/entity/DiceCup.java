package entity;

public class DiceCup {
	private Dice[] cup;
 	
public DiceCup(int amount){
	cup = new Dice[amount];
}

public void rollDice(){
for (int i = 0; i < cup.length; i++){
		cup[i].roll();
	}
}

public int getSum()	{
	int sum = 0;
	for (int i = 0; i < cup.length; i++){
		sum += cup[i].getValue();
	}
	return sum;
}

public int getFaceValue(int a){
	return cup[a].getValue();
}
}
