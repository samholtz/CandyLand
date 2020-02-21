package CandyLand;

import CandyLand.Deck;
import CandyLand.Card;
import java.util.ArrayList;


public class Game {
	public static void main (String[] args) {
		
		// create an initialization (init) class --> create 3 arrays 0-57 long and init in parallel so the nth element corresponds to a card
		
		
		
		Deck deck = new Deck();
				
		deck.add(new Card("regular", "red", "1"));
		deck.add(new Card("regular", "blue", "2"));
		deck.add(new Card("regular", "purple", "6"));
		deck.add(new Card("regular", "yellow", "5"));
		deck.add(new Card("regular", "green", "4"));
		deck.add(new Card("regular", "black", "3"));
		
		for (int i = 0; i < deck.getSize(); i++) {
		      System.out.println(deck.get(i));
		}
		
		deck.shuffle();
		System.out.println("after shuffling: ");
		for (int i = 0; i < deck.getSize(); i++) {
		      System.out.println(deck.get(i));
		}
		
		
		Board board = new Board();
		board.makeSpaces();
		Board.makeBoard();
		
		
	}
}


