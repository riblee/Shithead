package org.a13.shithead.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.a13.shithead.java.model.Card;
import org.a13.shithead.java.model.Deck;
import org.junit.Test;

public class DeckTest {

	Deck deck = new Deck(1);
	Deck deck2 = new Deck(2);
	Deck deck3 = new Deck(3);
	
	@Test
	public void test() {
		assertEquals(52, deck.getNumOfCards());
		Card c = deck.getNextCard();
		assertNotNull(c);
		assertEquals(Card.Suite.HEART, c.getSuit());
		assertEquals(Card.Value.TWO, c.getValue());
		assertEquals(6, deck.getNextCards(6).size());
		assertEquals(45, deck.getNumOfCards());
		assertEquals(45, deck.getNextCards(50).size());
	}

	@Test
	public void test2() {
		assertEquals(104, deck2.getNumOfCards());
		Card c = deck2.getNextCard();
		assertNotNull(c);
		assertEquals(Card.Suite.HEART, c.getSuit());
		assertEquals(Card.Value.TWO, c.getValue());
		assertEquals(13, deck2.getNextCards(13).size());
		assertEquals(90, deck2.getNumOfCards());
		assertEquals(90, deck2.getNextCards(1000).size());
	}
	
	@Test
	public void test3() {
		assertEquals(156, deck3.getNumOfCards());
		@SuppressWarnings("unchecked")
		ArrayList<Card> ac=(ArrayList<Card>) deck3.getCards().clone();
		deck3.shuffle();
		assertNotEquals(ac, deck3.getCards());
	}
}
