package org.a13.shithead.java.control.players;

import java.util.ArrayList;

import org.a13.shithead.java.model.Card;
import org.a13.shithead.java.model.IPlayer;

public class AdamPlayer implements IPlayer {

	@Override
	public String getName() {
		return "Adam";
	}

	@Override
	public ArrayList<Card> nextCard(ArrayList<Card> ownCard,
			ArrayList<Card> publicCard, ArrayList<Card> cardsOnTable) {
		return null;
	}

	@Override
	public ArrayList<Card> chooseOwnCard(ArrayList<Card> ownCard,
			ArrayList<Card> publicCard) {
		return ownCard;
	}

}
