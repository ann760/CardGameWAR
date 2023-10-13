package CardGameWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
//	variables
	private List<Card> cards = new ArrayList<Card>();
	
	
//	conatructor
	Deck(){
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
				           "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
		
		for (String suit : suits) {	
			int value = 2;
			for (String number : numbers){
				String name = number +" Of "+ suit;
				Card card = new Card(name, value);
				this.cards.add(card);
				value++;
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		return this.cards.remove(0);
//		
	}
}
