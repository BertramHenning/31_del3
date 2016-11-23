package entity;
import java.util.Random;

public class DiceCup {
	protected int d1, d2; //d1 and d2 are the two dices kept in the dice cup
    Random rand;  
	
public DiceCup(){
	rand = new Random();
}

public void rollDice(){
	d1 = rand.nextInt(6) + 1;
	d2 = rand.nextInt(6) + 1;		
}

public int[] getDice()	{
	int[] result = {d1, d2};
return result;
}

public int getSum()	{
	int sum = d1 + d2;
	return sum;
}

public String toString(){
	return "Dice 1: " + d1 + ", Dice 2: " + d2;
}
}
