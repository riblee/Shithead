package org.a13.shithead.test;

import static org.junit.Assert.*;

import org.a13.shithead.java.model.Card;
import org.junit.Test;

public class CardTest {
	
	
	Card tester = new Card(Card.Suite.CLUB, Card.Value.FOUR);
	@Test
	public void test() {
		assertEquals("Card [suit=CLUB, value=FOUR]", tester.toString());
		assertEquals(Card.Suite.CLUB, tester.getSuit());
		assertEquals(Card.Value.FOUR, tester.getValue());
	}

}
