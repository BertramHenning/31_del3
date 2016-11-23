package controller;

import boundary.GUIHandler;
import entity.DiceCup;
import entity.GameBoard;
import entity.PlayerList;

public class Controller {
	private GUIHandler gui;
	private GameBoard board;
	private PlayerList list;
	private DiceCup cup;
	private int turn = 0;
	

	public Controller() {
		gui = new GUIHandler();
		board = new GameBoard();
		cup = new DiceCup(2);
	}

	public void startGame(){
		gui.createBoard();
		addPlayers();
		for ( int i = 0; i < list.getPlayerAmount(); i++){
			System.out.println(i);
			gui.addPlayer(list.getName(i));
		}
		while(true){
			gui.showMessage("It's your turn " + list.getName(turn)+", press OK to roll dice.");
			
			cup.rollDice();
			gui.setDice(cup.getFaceValue(0), cup.getFaceValue(1));
			
			list.movePosition(turn, cup.getSum());
			gui.moveCar(list.getName(turn), list.getPosition(turn));
			
			board.getField(list.getPosition(turn)).landOnField(list.getPlayer(turn));
			
			break;
		}
		
	}
	
	public void addPlayers(){
		int playerAmount = gui.askAmount("Enter player amount between 2 and 6:", 2, 6);
		String[] names = new String[playerAmount];
		for (int i = 0; i < playerAmount; i++){
			names[i] = gui.askString("Player "+ (i+1) + " enter your name");
		}
		list = new PlayerList(playerAmount, names);
	}
}
