package CardGameWAR;

public class App {
	
	public static void main(String[] args) {

		System.out.println("The Card Game 'WAR!'");
		System.out.println();
		
	//	A. Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck gameDeck = new Deck();
		System.out.println("The deck has "+ gameDeck.getCards().size()+ " cards");
		System.out.println();
	 
		System.out.println("The players are: ");
		Player player1 = new Player("Ann-Marie");
		player1.describe();
		String p1 = player1.getPlayer();
		
		Player player2 = new Player("Jack");
		player2.describe();
		String p2 = player2.getPlayer();
		System.out.println();
		
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
	/* players haave cards */
		System.out.println("Player has "+ player1.getPlayerHand().size()+ " cards");
		System.out.println("Player has "+ player2.getPlayerHand().size()+ " cards");
		System.out.println();
		
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