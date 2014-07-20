package org.a13.shithead.java.model;

public class Card {
	public enum Suite {
		HEART, DIAMOND, CLUB, SPADE
	}

	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private Suite suit;
	private Value value;

	public Card(Suite suit, Value value) {
		this.setSuit(suit);
		this.setValue(value);
	}

	public Suite getSuit() {
		return suit;
	}

	private void setSuit(Suite suit) {
		this.suit = suit;
	}

	public Value getValue() {
		return value;
	}

	private void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit.name() + ", value=" + value.name() + "]";
	}

}
