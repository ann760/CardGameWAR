package CardGameWAR;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

public class App {
	
	public static void main(String[] args) {

/* create a card deck */
	Deck deck = new Deck();
	System.out.println("Deck has "+ deck.getCards().size()+ " cards");
//	deck.describe();
//	System.out.println();
	
/* suffle the cards */
	deck.shuffle();
//	System.out.println("The Deck is");
//	deck.describe();
//	System.out.println();
	
/* draw the top card from the deck*/
	System.out.print("Draw a card");
	Card drawn = deck.draw();
	System.out.print("The Card is ");
	drawn.describe();
	System.out.println("Deck has "+ deck.getCards().size()+ " cards");
	System.out.println();

/* create a player */
	Player player1 = new Player("Me");
	String p1 = player1.getPlayer();
	System.out.println("The Player is " + p1);
	System.out.println();

	player1.setPlayerHand(deck.getCards());
	player1.describe();
	System.out.println();
	
/* draw from deck again*/
	Card topCard = deck.draw();
	System.out.println(p1 + "'s card is: "); 
	topCard.describe();
	System.out.println();
	
/* flip from player hand */
	Card pCard = player1.flip();
	System.out.println(p1 + "'s card is: "); 
	pCard.describe();
	
/* draw cards from deck and add to player hand */
	Player player2 = new Player("Me");
	System.out.println();
	player2.draw(deck);
	player2.draw(deck);
	player2.draw(deck);
	player2.describe();
	System.out.println("Deck has "+ deck.getCards().size()+ " cards");
	
	System.out.println("-------------END OF CHECKS-------------------");

	System.out.println("Lets Play WAR!");
	System.out.println();
	
//	A. Instantiate a Deck and two Players, call the shuffle method on the deck.
	Deck gameDeck = new Deck();
	System.out.println("Deck has "+ gameDeck.getCards().size()+ " cards");
//	B. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//	C. Using a traditional for loop, iterate 26 times and call the flip method for each player.
//	D. Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
//	E. After the loop, compare the final score from each player.
//	F. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

	
	
	
	
	
//	Deal out cards
//	Scanner inNumPlayers = new Scanner(System.in);
//	System.out.print("Enter the number of player: ");
//	String readInput = inNumPlayers.nextLine();
//	int numOfPlayers = Integer.valueOf(readInput);
	
//	int numOfPlayers = 2;
//	Map<String, List<Card>> gameBoard = new HashMap<>();
//	gameBoard = dealCards(numOfPlayers);
//	
//	System.out.println("------------------");
//	for (int i = 1; i <= numOfPlayers; i++) {
//		
//		String playerName = "Player " + i;
//		List<Card> playerHand = gameBoard.get(playerName);
//		
//		Player player = new Player(playerName, 0, playerHand);
//		player.describe();
//		
//	}
//	
//	System.out.println();
//		
//	

//	System.out.println(gameBoard.size());
	
//  variables
//		String winner = "";
		
		
		
//	inNumPlayers.close();	
	
	}
	
//	Methods
//	deal cards
//	static Map<String, List<Card>> dealCards(int numOfPlayers){
//		Map<String, List<Card>> finalGameMap = new HashMap<>();
//		Deck deck = new Deck();
//		deck.shuffle();
////		deck.describe();
//		System.out.println("Deck has "+ deck.getCards().size()+ " cards");
//		
//		for (int i = 1; i <= numOfPlayers; i++) {
//			List<Card> playerHand = new ArrayList<>();
//			String playerName = "Player " + i;
//			finalGameMap.put(playerName, playerHand);	
//		}
//		
//		for (int i = 0; i < 52/numOfPlayers; i++){
////			nested loop deals a card to each player
//			for (int j = 1; j <= numOfPlayers; j++) {
//				String playerName = "Player " + j;
//				List<Card> playerHand = finalGameMap.get(playerName);
//				playerHand.add(deck.draw());
//				finalGameMap.replace(playerName, playerHand);
//			}
//		}
//		if (52 % numOfPlayers !=0) {
//			System.out.println("With " + numOfPlayers + " players -- ");
//			System.out.println("Cards left in deck: " + 52%numOfPlayers);
//			
//		} else {
//			System.out.println("All cards have been delt");
//		}
//		return finalGameMap;
//	}
	
}

