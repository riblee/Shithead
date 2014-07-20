package org.a13.shithead.java.control;

import java.util.ArrayList;

import org.a13.shithead.java.model.Card;
import org.a13.shithead.java.model.IPlayer;
import org.a13.shithead.java.model.Player;

public class ShitheadGame {

	public ShitheadGame(ArrayList<IPlayer> players){
		//Létrehozni a decket
		//Létrehozni a playereket + tárolni (pl: HashMap<IPlayer, Player>)
		//Létrehozni a table-t
		//előkészíti a paklit (shuffle) és kiosztja a playereknek
	}
	
	public void run(){
		
		while(/*table.getNumberOfPlayers()>1*/true){
			
		}
		//amíg már csak 1 játékos maradt, csinálja a következőt:
		//ha "nulladik" kör, akkor chooseOwnCard() hívása az i. Iplayeren
		//különben nextCard hívása
		
		//ellenörző és végrehajtó metódusok:
		//érvényes visszatérési érték?végrehajt:defaultVégrehajt
		//pl: isChoosenOwnCardIsValid(Player p, ArrayList<Card> c)
		//Ha valid akkor a kiválasztott kártyákkal játszik, a publikus meg a többi marad
		//ha nem, akkor pedig marad minden ugyanúgy
	}
	
	public boolean isChoosenOwnCardIsValid(Player p, ArrayList<Card> c){
		return false;
	}
	
}
