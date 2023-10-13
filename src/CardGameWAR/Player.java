package CardGameWAR;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
//	variables
	String player;
	int score;
	List<Card> playerHand = new ArrayList<Card>();
	
//	constructor set score to 0 in the constructor)
	Player(String player){
		this.player = player;
		this.score = 0;
	}
	
	public String getPlayer() {
		return player;
	}
	
	public void setPlayer(String player) {
		this.player = player;
	}

	public List<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void describe() {
		System.out.println("Player: " + this.player + " Score: " + this.score + "\n---------------");
		for (Card card : playerHand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return this.playerHand.remove(0);

	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		playerHand.add(card);
		return card;
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	
}
