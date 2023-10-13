package CardGameWAR;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CardGameWARTest {

	@Test
	void testDeck() {
		Deck deckT = new Deck();
		assertEquals(52, deckT.getCards().size());
	}
	
	@Test
	void testShuffel() {
		Deck shuffelDeck = new Deck();
		List<Card> deck = shuffelDeck.getCards();
		String topDeckCard = deck.get(0).getName();
		shuffelDeck.shuffle();
		List<Card> deckS = shuffelDeck.getCards();
		String topShuffelCard = deckS.get(0).getName();
		assertNotEquals(topDeckCard, topShuffelCard);
	}
	
	@Test
	void testDrawACardReturnsTopCard() {
		Deck deckT = new Deck();
		List<Card> dCards = deckT.getCards();
		assertEquals(dCards.get(0), deckT.draw());
	}
	
	@Test
	void testDrawACardRemovesFromDeck() {
		Deck deckT = new Deck();
		deckT.draw();
		assertEquals(51, deckT.getCards().size());
	}
	
	@Test
	void testPlayer() {
		Player playerT = new Player("Ann-Marie");
		assertEquals("Ann-Marie", playerT.getPlayer());
	}
	
	@Test
	void testPlayerSetHand() {
		Deck deckT = new Deck();
		Player playerT = new Player("Ann-Marie");
		playerT.setPlayerHand(deckT.getCards());
		assertEquals("Ann-Marie", playerT.getPlayer());
	}
	
	@Test
	void testPlayerFlipACard() {
		Deck deckT = new Deck();
		Player playerT = new Player("Ann-Marie");
		playerT.setPlayerHand(deckT.getCards());
		List<Card> hand = playerT.getPlayerHand();
		assertEquals(hand.get(0), playerT.flip());
	}
	
	@Test
	void testPlayerFlipACardRemovesFromHand() {
		Deck deckT = new Deck();
		Player playerT = new Player("Ann-Marie");
		playerT.setPlayerHand(deckT.getCards());
		playerT.flip();
		int handSize = playerT.getPlayerHand().size();
		assertEquals(51, handSize);
	}
	
	@Test
	void testDrawfromDeckAddsToPlayerHand() {
		Deck deckT = new Deck();
		Player playerT = new Player("Ann-Marie");
		playerT.draw(deckT);
		playerT.draw(deckT);
		playerT.draw(deckT);
		int handSize = playerT.getPlayerHand().size();
		assertEquals(3, handSize);
	}
	
	@Test
	void testPlayerDrawfromDeckRemovesFromDeck() {
		Deck deckT = new Deck();
		Player playerT = new Player("Ann-Marie");
		playerT.draw(deckT);
		playerT.draw(deckT);
		playerT.draw(deckT);
		int deckSize = deckT.getCards().size();
		assertEquals(49, deckSize);
	}
}
