package boundary;

import java.awt.Color;

public class Descriptions {
	
	// Create Array list with field names
	protected static String[] fieldNames = {
			"Tribe Encampment",
			"Crater",
			"Mountain",
			"Second Sail", // Fleet
			"Cold Desert",
			"Goldmine", // Tax
			"Black Cave",
			"Sea Grover", // Fleet
			"Huts in the Mountain", // Labor Camp
			"The Werewall",
			"Walled City", // Refuge
			"Mountain Village",
			"South Citadel",
			"The Buccaneers", // Fleet
			"Palace Gates",
			"Caravan", // Tax
			"Tower",
			"Privateer Armade", // Fleet 
			"The Pit", // Labor Camp
			"Castle",
			"Monastery" // Refuge
			};	
	
	// Create Array list with fieldValues
	protected static int[] fieldValue = {
			1000,
			1500,
			2000,
			4000, // Fleet
			3000,
			2000, // Tax
			4000, 
			4000, // Fleet
			2500, // Labor Camp
			4300, 
			5000, // Refuge
			4750,
			5000, 
			4000, // Fleet
			5500, 
			4000, // Tax
			6000,
			4000, // Fleet
			2500, // Labor Camp
			8000,
			500 // Refuge
			};
		
	// Create Array list with fieldRents
	protected static int[] fieldRent = {
			100,
			300,
			500,
			500, // Fleet
			700,
			0, // Tax
			1000,
			500, // Fleet
			100, // Labor Camp
			1300,
			0, // Refuge
			1600,
			2000,
			500, // Fleet
			2600,
			0, // Tax
			3200,
			500, // Fleet
			100, // Labor Camp
			4000,
			0, // Refuge
			};
	
	// Create Array list with field descriptions
	protected static String[] fieldDescription = {
			"The Rent is 100 coins.",
			"The Rent is 300 coins.",
			"The Rent is 500 coins.",
			"The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"The Rent is 700 coins.", 
			"You have entered the Holy Blessed Goldmine and obliged to donate 2000 coins.", // Tax
			"The Rent is 1000 coins.",			
			"The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"The Rent is 100 coins * dice roll value.",// Labor Camp
			"The Rent is 1300 coins.",
			"You have saved The Walled City from evil and dark creatures! They have funded you with 5000 coins for your courage.", // Refuge
			"The Rent is 1600 coins.",
			"The Rent is 2000 coins.",
			"The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"The Rent is 2600 coins.",
			"Pay 4000 coins or 10% of your total assets", // Tax
			"The Rent is 3200 coins.",
			"The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"The Rent is 100 coins * dice roll value.", // Labor Camp
			"The Rent is 4000 coins.",
			"You have finally found piece in the Monastery and received 500 coins." // Refuge
			};
	
	// Create Array list with asking questions
	protected static String[] fieldAsk = {
			"You have discovered a Tribe Encampment on your journey!" + "\n" + "Do you want to buy it for 1000 coins?",
			"An extraordinary Crater has been found!" + "\n" + "Do you want to buy it for 1500 coins?",
			"You have finally ascended the legendary Mountain!" + "\n" + "Do you want to buy it for 2000 coins?",
			"The Sea Coast have been reached with plenty of ships to sail!" + "\n" + "Do you want to buy it for 4000 coins?", // Fleet
			"The Winter has come! A Cold Desert has appeared." + "\n" + "Do you want to buy it for 3000 coins?",
			"", // Tax
			"You have found the feared Black Cave!" + "\n" + "Do you want to buy it for 4000 coins?",
			"The Sea Grover has been discovered in the Dark Tides!" + "\n" + "Do you want to buy it for 4000 coins?", // Fleet
			"You have discovered hidden huts on your journey in the Mountains!" + "\n" + "Do you want to buy it for 2500 coins?", // Labor Camp
			"It is dark night with a full moon. The Werewall has appeared from the darkness!" + "\n" + "Do you want to buy it for 4300 coins?",
			"", // Refuge
			"You have found a Mountain Village on journey." + "\n" + "Do you want to buy it for 4750 coins?",
			"You have reached a beautiful city, called the South Citadel, on your journey!" + "\n" + "Do you want to buy it for 5000 coins?",
			"Arrrgh!! You have found the pirates, called 'The Buccaneers', fleet base" + "\n" + "Do you want to buy it for 4000 coins?", // Fleet
			"You have found the Holy Palace Gates!" + "\n" + "Do you want to buy it for 5500 coins?",
			"A Caravan approached you! You generosity forced you to spend either 4000 coins or 10% of your total assets. Choose wisely", // Tax
			"You have entered a heavily guarded Tower!" + "\n" + "Do you want to buy it for 6000 coins?",
			"You have found a fleet base called 'Privateer Armade'" + "\n" + "Do you want to buy it for 4000 coins?", // Fleet
			"You have discovered a labor camp called The Pit." + "\n" + "Do you want to buy it for 2500 coins?", // Labor Camp
			"The Royal Castle is bankrupt after several wars!" + "\n" + "Do you want to buy it for 8000 coins?",
			""
			};
	
	// Create Array list with field colors
	protected static Color[] fieldColor = {
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.63,(float) 0.73,(float) 0.57), //fleet
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.90), //tax
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.630,(float) 0.73,(float) 0.57), //fleet
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.25), //labor camp
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 1.00), //refuge
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.630,(float) 0.73,(float) 0.57), //fleet
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.90), //tax
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.630,(float) 0.73,(float) 0.57), //fleet
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.25), //labor camp
			Color.getHSBColor((float)0.27,(float) 0.73,(float) 0.72), //territory
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 1.00), //refuge	
			};
}

	


