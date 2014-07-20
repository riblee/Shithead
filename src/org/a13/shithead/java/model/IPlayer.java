package org.a13.shithead.java.model;

import java.util.ArrayList;

public interface IPlayer {
	
	String getName();
	ArrayList<Card> nextCard(ArrayList<Card> ownCard, ArrayList<Card> publicCard, ArrayList<Card> cardsOnTable);
	ArrayList<Card> chooseOwnCard(ArrayList<Card> ownCard, ArrayList<Card> publicCard);

}
