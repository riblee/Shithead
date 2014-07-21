package org.a13.shithead.java.control;

import java.util.ArrayList;

import org.a13.shithead.java.control.players.AdamPlayer;
import org.a13.shithead.java.control.players.RandomPlayer;
import org.a13.shithead.java.model.IPlayer;

public class Main {

	public static void main(String[] args) {
		ArrayList<IPlayer> players = new ArrayList<IPlayer>();
		players.add(new AdamPlayer());
		players.add(new RandomPlayer());
		
		ShitheadGame game = new ShitheadGame(players);
		game.run();
	}

}
