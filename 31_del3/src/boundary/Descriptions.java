package boundary;

import java.awt.Color;

public class Descriptions {
	
	protected static String[] fieldNames = {
			"Tribe Encampment",
			"Crater",
			"Mountain",
			"Second Sail" // Fleet
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
			}	
	
	protected static int[] fieldPrice = {
			1000,
			1500,
			2000,
			4000, // Fleet
			3000,
			0, // Tax
			4000, 
			4000, // Fleet
			2500, // Labor Camp
			4300, 
			0, // Refuge
			4750,
			5000, 
			4000, // Fleet
			5500, 
			0, // Tax
			6000,
			4000, // Fleet
			2500, // Labor Camp
			8000,
			0 // Tax
			}
		
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
			}
	
	protected static int[] fieldPay = {
			0,
			0,
			0,
			0, // Fleet
			0,
			2000, // Tax
			0,
			0, // Fleet
			0, // Labor Camp
			0,
			0, // Refuge
			0,
			0,
			0, // Fleet
			0,
			4000, // Tax
			0,
			0, // Fleet
			0, // Labor Camp
			0,
			0, // Refuge
			}
	
	protected static int[] fieldReceive = {
			0,
			0,
			0,
			0, // Fleet
			0,
			0, // Tax
			0,
			0, // Fleet
			0, // Labor Camp
			0,
			5000, // Refuge
			0,
			0,
			0, // Fleet
			0,
			0, // Tax
			0,
			0, // Fleet
			0, // Labor Camp
			0,
			500, // Refuge			
			}
	
	protected static String[] fieldDescription = {
			"You have discovered a" + fieldNames[0] + "on your journey!" + "\n" + "Do you want to buy it for" + fiedPrice[0] + "coins?" + "\n" + "The Rent is" + fieldRent[0] "coins.",
			"An extraordinary Crater has been found!" + "\n" + "Do you want to buy it for 1500 coins?" + "\n" + "The Rent is 300 coins.",
			"You have finally ascended the legendary Mountain!" + "\n" + "Do you want to buy it for 2000 coins?" + "\n" + "The Rent is 500 coins.",
			"The Sea Coast have been reached with plenty of ships to sail!" + "\n" + "Do you want to buy it for 4000 coins?" + "\n" + "The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"The Winter has come! A Cold Desert has appeared." + "\n" + "Do you want to buy it for 3000 coins?" + "\n" + "The Rent is 700 coins.", 
			"You have entered the Holy Blessed Goldmine and obliged to donate 2000 coins.", // Tax
			"You have found the feared Black Cave!" + "\n" + "Do you want to buy it for 4000 coins?" + "\n" + "The Rent is 1000 coins.",			
			"The Sea Grover has been discovered in the Dark Tides!" + "\n" + "Do you want to buy it for 4000 coins?" + "\n" + "The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"You have discovered hidden huts on your journey in the Mountains!" + "\n" + "Do you want to buy it for 2500 coins?" + "\n" + "The Rent is 100 coins * dice roll value.",// Labor Camp
			"It is dark night with a full moon. The Werewall has appeared from the darkness!" + "\n" + "Do you want to buy it for 4300 coins?" + "\n" + "The Rent is 1300 coins.",
			"You have saved The Walled City from evil and dark creatures! They have funded you with 5000 coins for your courage.", // Refuge
			"You have found a Mountain Village on journey." + "\n" + "Do you want to buy it for 4750 coins?" + "\n" + "The Rent is 1600 coins.",
			"You have reached a beautiful city, called the South Citadel, on your journey!" + "\n" + "Do you want to buy it for 5000 coins?" + "\n" + "The Rent is 2000 coins.",
			"Arrrgh!! You have found the pirates, called 'The Buccaneers', fleet base" + "\n" + "Do you want to buy it for 4000 coins?" + "\n" + "The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.", // Fleet
			"You have found the Holy Palace Gates!" + "\n" + "Do you want to buy it for 5500 coins?" + "\n" + "The Rent is 2600 coins.",
			"A Caravan approached you! You generosity forced you to spend either 4000 coins or 10% of your total assets.", // Tax
			"You have entered a heavily guarded Tower!" + "\n" + "Do you want to buy it for 6000 coins?" + "\n" + "The Rent is 3200 coins.",
			"You have found a fleet base called 'Privateer Armade'" + "\n" + "Do you want to buy it for 4000 coins?" + "\n" + "The Rent is 500-4000 coins." + "\n" + "1 Fleet: 500 coins." + "\n" + "2 Fleets: 1000 coins." +  "\n" + "3 Fleets: 2000 coins." + "\n" + "4 Fleets: 4000 coins.",
			"You have discovered a labor camp called The Pit." + "\n" + "Do you want to buy it for 2500 coins?" + "\n" + "The Rent is 100 coins * dice roll value.", // Labor Camp
			"The Royal Castle is bankrupt after several wars!" + "\n" + "Do you want to buy it for 8000 coins?" + "\n" + "The Rent is 4000 coins.",
			"You have finally found piece in the Monastery and received 500 coins." // Refuge
			}
	
	protected static Color[] fieldColor = {}
			
		
			}
	

}
