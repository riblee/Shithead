package org.a13.shithead.java.model;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

	private Collection<Player> players;
	private Deck deck;
	private ArrayList<Card> onTheTable;

	public Table(Collection<Player> collection, int numOfDecks) {
		this.setPlayers(collection);
		this.setDeck(new Deck(numOfDecks));
		this.setOnTheTable(new ArrayList<Card>());
	}

	public Collection<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<Player> collection) {
		this.players = collection;
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
	
	public int getNumberOfPlayingPlayers() {
		int i=0;
		for(Player p : players){
			if(p.getNumberOfCards()>0){
				i++;
			}
		}
		return i;
	}

	public Card getLastCardOnTheTable() {
		if (onTheTable.size() != 0)
			return onTheTable.get(onTheTable.size() - 1);
		else
			return null;
	}

}
