package CardGameWAR;

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
	System.out.print("Draw a card. ");
	Card drawn = deck.draw();
	System.out.print("The Card is ");
	drawn.describe();
	System.out.println("Deck has "+ deck.getCards().size()+ " cards");
	System.out.println();

/* create a player */
	Player playerA = new Player("Me");
	String pA = playerA.getPlayer();
	System.out.println("The Player is " + pA);
	System.out.println();

	playerA.setPlayerHand(deck.getCards());
//	playerA.describe();
//	System.out.println();
	
/* draw from deck again*/
	Card topCard = deck.draw();
	System.out.print("The card is: "); 
	topCard.describe();
	System.out.println();
	
/* flip from player hand */
	Card pCard = playerA.flip();
	System.out.println(pA + "'s card is: "); 
	pCard.describe();
	System.out.println();
	
/* draw cards from deck and add to player hand */
	Player playerB = new Player("Me1");
	String pB = playerB.getPlayer();
	playerB.draw(deck);
	playerB.draw(deck);
	playerB.draw(deck);
	playerB.describe();
	System.out.println("Player has "+ playerB.getPlayerHand().size()+ " cards");
	System.out.println("Deck has "+ deck.getCards().size()+ " cards");
	
	Card fCard = playerB.flip();
	System.out.print(pB + "'s card is: "); 
	fCard.describe();
	System.out.println("Player has "+ playerB.getPlayerHand().size()+ " cards");
	System.out.println();
	
	System.out.println("-------------END OF CHECKS-------------------");

//	-----------------------------------------------------------------------------
	System.out.println("The Game OF WAR!");
	System.out.println();
	
//	A. Instantiate a Deck and two Players, call the shuffle method on the deck.
	Deck gameDeck = new Deck();
	System.out.println("Deck has "+ gameDeck.getCards().size()+ " cards");
	gameDeck.shuffle();
	System.out.println();
 
	Player player1 = new Player("Ann-Marie");
	player1.describe();
	String p1 = player1.getPlayer();
	
	Player player2 = new Player("Jack");
	player2.describe();
	String p2 = player2.getPlayer();
	System.out.println();
	
	System.out.println("Deck has " + gameDeck.getCards().size() + " cards");
//	B. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	for (int i = 1; i <= 52; i++) {
		if (i % 2 != 0) {
//			System.out.println("one for me");
			player1.draw(gameDeck);
		} else {
//			System.out.println("one for you");
			player2.draw(gameDeck);
		}
	}
	System.out.println();
/* show players cards */
//	player1.describe();
	System.out.println("Player has "+ player1.getPlayerHand().size()+ " cards");
//	System.out.println();
//	player2.describe();
	System.out.println("Player has "+ player2.getPlayerHand().size()+ " cards");
//	System.out.println();
	
	System.out.println("Let's Play");
	System.out.println();
//	C. Using a traditional for loop, iterate 26 times and call the flip method for each player.
	for (int i = 1; i <= 26; i++) {
		
		Card play1Card = player1.flip();
		System.out.print(p1 + "'s card is: "); 
		play1Card.describe();
		int p1Card = play1Card.getValue();
	
		Card play2Card = player2.flip();
		System.out.print(p2 + "'s card is: "); 
		play2Card.describe();
		int p2Card = play2Card.getValue();
		
//	D. Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.

		if (p1Card > p2Card) {
			player1.incrementScore();
			System.out.println(p2 + " Wins Round!");
		} else {
			player2.incrementScore();
			System.out.println(p2 + " Wins Round!");
			}
//	E. After the loop, compare the final score from each player.	
		System.out.println(p1 + ": " + player1.getScore() + " -- " + p2 + ": " + player2.getScore());
		System.out.println();
//	F. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		if (i == 26) {
			if (player1.getScore() >  player2.getScore()) {
				System.out.println(p1 + " Wins!!!");
			} else if (player1.getScore() <  player2.getScore()) {
				System.out.println(p2 + " Wins!!!");
			} else if (player1.getScore() ==  player2.getScore()) {
				System.out.println("It's a draw");
				}
			}
		} 
		System.out.println("Game Over");
	}
	
}