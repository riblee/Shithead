package org.a13.shithead.java.control;

import java.util.ArrayList;
import java.util.HashMap;

import org.a13.shithead.java.model.Card;
import org.a13.shithead.java.model.IPlayer;
import org.a13.shithead.java.model.Player;
import org.a13.shithead.java.model.Table;

public class ShitheadGame {

	private final int NUMBER_OF_CARDS = 4;

	private HashMap<IPlayer, Player> playersMap;
	private Table table;

	public ShitheadGame(ArrayList<IPlayer> players) {
		playersMap = new HashMap<IPlayer, Player>();
		for (IPlayer p : players) {
			Player player = new Player(p.getName());
			playersMap.put(p, player);
		}
		table = new Table(playersMap.values(), 2);
		table.getDeck().shuffle();
		for (Player p : playersMap.values()) {
			dealOutCards(p.getOwnCard(), NUMBER_OF_CARDS);
			dealOutCards(p.getSecretCard(), NUMBER_OF_CARDS);
			dealOutCards(p.getPublicCard(), NUMBER_OF_CARDS);
			System.out.println(p);
		}
	}

	public void run() {

		chooseOwnCardRound();
		while (table.getNumberOfPlayingPlayers() > 1) {
			for (IPlayer p : playersMap.keySet()) {
				boolean isPNext = true;
				while (isPNext) {
					ArrayList<Card> ownCards = playersMap.get(p).getOwnCard();
					ArrayList<Card> publicCards = playersMap.get(p)
							.getPublicCard();
					ArrayList<Card> cardsOnTable = table.getOnTheTable();

					ArrayList<Card> nextCards = p.nextCard(ownCards,
							publicCards, cardsOnTable);
					// ha a nextCards üres/vagy null, akkor felveszi a paklit
					// ha érvénytelen lapok vannak benne, felveszi a paklit
					// ha törölt akkor újra p jön
					// ha érvényes és nem törölt, akkor jön a következő p
					isPNext=false;
				}
			}
		}
		// ellenörző és végrehajtó metódusok:
		// érvényes visszatérési érték?végrehajt:defaultVégrehajt
		// pl: isChoosenOwnCardIsValid(Player p, ArrayList<Card> c)
		// Ha valid akkor a kiválasztott kártyákkal játszik, a publikus meg a
		// többi marad
		// ha nem, akkor pedig marad minden ugyanúgy
	}

	private void chooseOwnCardRound() {
		for (IPlayer p : playersMap.keySet()) {
			ArrayList<Card> ownCards = playersMap.get(p).getOwnCard();
			ArrayList<Card> publicCards = playersMap.get(p).getPublicCard();

			ArrayList<Card> choosenCards = p.chooseOwnCard(ownCards,
					publicCards);

			boolean valid = choosenCards != null
					&& choosenCards.size() == NUMBER_OF_CARDS ? true : false;

			if (valid) {
				for (Card c : choosenCards) {
					if (!ownCards.contains(c) && !publicCards.contains(c)) {
						valid = false;
					}
				}
			}

			if (valid) {
				ArrayList<Card> newPublicCard = new ArrayList<Card>();
				ownCards.addAll(publicCards);
				for (Card c : ownCards) {
					if (!choosenCards.contains(c)) {
						newPublicCard.add(c);
					}
				}
				playersMap.get(p).setOwnCard(choosenCards);
				playersMap.get(p).setPublicCard(newPublicCard);
			}
		}
	}

	private void dealOutCards(ArrayList<Card> cards, int num) {
		for (int i = 0; i < num; i++) {
			Card c = table.getDeck().getNextCard();
			cards.add(c);
		}
	}

	public boolean isChoosenOwnCardIsValid(Player p, ArrayList<Card> c) {
		return false;
	}

}
