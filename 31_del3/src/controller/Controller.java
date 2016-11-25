package controller;

import boundary.GUIHandler;
import entity.DiceCup;
import entity.GameBoard;
import entity.PlayerList;

/**
 * Runs the game logic
 */
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

	/**
	 * Starts and runs the game
	 */
	public void startGame() {
		gui.createBoard();
		//Shows the players the rules
		gui.showMessage("Rules: \nA game consist of 2-6 players and each player starts with 30000 coins. The objective of the game is to bankrupt the other players, meaning their coin total reached zero. To do this each player must buy properties to make his/her opponents pay rent when they land on the player's field. The players take turns rolling two dice and the game will move them to the according field. The game ends when all but one player has gone bankrupt.");
		addPlayers();
		//Adds all the players to the gui
		for (int i = 0; i < list.getPlayerAmount(); i++) {
			System.out.println(i);
			gui.addPlayer(list.getName(i));
		}
		//Runs the game until a winner is found 
		while (true) {
			if (list.getPlayerAmount() == 1 ){
				gui.showMessage("Congratulations " + list.getName(turn) + " you won the game!");
				break;
			}
			
			gui.showMessage("It's your turn " + list.getName(turn) + ", press OK to roll dice");

			//Dice roll
			cup.rollDice();
			gui.setDice(cup.getFaceValue(0), cup.getFaceValue(1));
			list.setDiceSum(turn, cup.getSum());

			//Car movement
			list.movePosition(turn, cup.getSum());
			gui.moveCar(list.getName(turn), list.getPosition(turn));

			//Landing on a field
			board.getField(list.getPosition(turn) - 1).landOnField(list.getPlayer(turn));

			//Updates all players balance on the GUI
			for (int i = 0; i < list.getPlayerAmount(); i++) {
				gui.displayBalance(list.getName(i), list.getCoins(i));
			}
			
			//Removes the player if they are bankrupt
			if (list.getCoins(turn) <= 0){
				gui.removeCar(list.getName(turn));
				gui.showMessage(list.getName(turn) + ", you've been bankrupted by your friends, thanks for playing!");
				list.removePlayer(turn);
			}
			
			//Gives the turn to the next player
			turn++;
			if (turn >= list.getPlayerAmount()) {
				turn = 0;
			}
		}

	}

	/**
	 * Adds players to a list with user input
	 */
	public void addPlayers() {
		int playerAmount = gui.askAmount("Enter player amount between 2 and 6:", 2, 6);
		String[] names = new String[playerAmount];
		for (int i = 0; i < playerAmount; i++) {
			//Tests if the new name is the same as another players name
			while(true){
				boolean sameName = false;
				names[i] = gui.askString("Player " + (i + 1) + " enter your name:");
				for (int j = 0; j < i; j++){
					if (names[i].equals(names[j])){
						sameName = true;
						gui.showMessage("You cant have the same name as another player");
					}
				}
				if (sameName == false){
					break;
				}
			}
		}
		list = new PlayerList(playerAmount, names);
	}
}
