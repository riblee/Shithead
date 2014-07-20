package org.a13.shithead.java.model;

import java.util.ArrayList;
import java.util.Collections;

import org.a13.shithead.java.model.Card.Suite;
import org.a13.shithead.java.model.Card.Value;

public class Deck {
	private ArrayList<Card> cards;

	public Deck(int numberOfDeck) {
		cards = new ArrayList<>();
		for (int i = 0; i < numberOfDeck; i++) {
			for (Suite s : Card.Suite.values()) {
				for (Value v : Card.Value.values()) {
					cards.add(new Card(s, v));
				}
			}
		}
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public int getNumOfCards() {
		return cards.size();
	}

	public ArrayList<Card> getNextCards(int numOfCards) {
		ArrayList<Card> ret = new ArrayList<Card>();
		for (int i = 0; i < numOfCards && hasNext(); i++) {
			ret.add(cards.get(0));
			cards.remove(0);
		}
		return ret;
	}

	public Card getNextCard() {
		if (hasNext()) {
			Card c = cards.get(0);
			cards.remove(0);
			return c;
		}
		return null;
	}

	public boolean hasNext() {
		return !cards.isEmpty();
	}
	
	public void shuffle(){
		Collections.shuffle(cards);
	}

}
