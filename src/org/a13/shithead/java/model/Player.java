package org.a13.shithead.java.model;

import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<Card> ownCard;
	private ArrayList<Card> publicCard;
	private ArrayList<Card> secretCard;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getOwnCard() {
		return ownCard;
	}

	public void setOwnCard(ArrayList<Card> ownCard) {
		this.ownCard = ownCard;
	}

	public ArrayList<Card> getPublicCard() {
		return publicCard;
	}

	public void setPublicCard(ArrayList<Card> publicCard) {
		this.publicCard = publicCard;
	}

	public ArrayList<Card> getSecretCard() {
		return secretCard;
	}

	public void setSecretCard(ArrayList<Card> secretCard) {
		this.secretCard = secretCard;
	}

	public int getNumberOfCards() {
		return ownCard.size() + publicCard.size() + secretCard.size();
	}

}
