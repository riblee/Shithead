package org.a13.shithead.java.model;

import java.util.ArrayList;

public class Table {

	private ArrayList<Player> players;
	private Deck deck;
	private ArrayList<Card> onTheTable;

	public Table(ArrayList<Player> players, int numOfDecks) {
		this.setPlayers(players);
		this.setDeck(new Deck(numOfDecks));
		this.setOnTheTable(new ArrayList<Card>());
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public ArrayList<Card> getOnTheTable() {
		return onTheTable;
	}

	public void setOnTheTable(ArrayList<Card> onTheTable) {
		this.onTheTable = onTheTable;
	}

	public int getNumberOfPlayers() {
		return players.size();
	}

	public Card getLastCardOnTheTable() {
		if (onTheTable.size() != 0)
			return onTheTable.get(onTheTable.size() - 1);
		else
			return null;
	}

}
