package slapJack;

import java.io.Serializable;

public class GameData implements Serializable
{
private int[] serverDeck;
	
	//both players start with 5 cards
	private int player1cards = 5;
	private int player2cards = 5;
	
	//Deck on table, -1 means no cards there
	private int[] tableDeck = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	//player decks, size of 5 ints, initial deck
	private int[] player1deck;
	private int[] player2deck;
	
	//increments each time a player plays, total of 5
	private int player1turn = 0;
	private int player2turn = 0;
	
	//getters
	public int[] getServerDeck()
	{
		return serverDeck;
	}
	public int getP1cards()
	{
		return player1cards;
	}
	public int getP2score()
	{
		return player2cards;
	}
	public int[] getTableDeck()
	{
		return tableDeck;
	}
	public int[] getP1Deck()
	{
		return player1deck;
	}
	public int[] getP2Deck()
	{
		return player2deck;
	}	
	public int getP1turn()
	{
		return player1turn;
	}
	public int getP2turn()
	{
		return player2turn;
	}
	
	//setters
	public void setServerDeck(int[] serverDeck)
	{
		this.serverDeck = serverDeck;
	}
	public void setP1cards(int player1cards)
	{
		this.player1cards = player1cards;
	}
	public void setP2cards(int player2cards)
	{
		this.player2cards = player2cards;
	}
	public void setTableDeck(int[] tableDeck)
	{
		this.tableDeck = tableDeck;
	}
	public void setP1Deck(int[] player1deck)
	{
		this.player1deck = player1deck;
	}
	public void setP2Deck(int[] player2deck)
	{
		this.player2deck = player2deck;
	}
	public void setP1turn(int player1turn)
	{
		this.player1turn = player1turn;
	}
	public void setP2turn(int player2turn)
	{
		this.player2turn= player2turn;
	}
	
	
	//constructor
	public GameData(int[] serverDeck, int player1cards, int player2cards, int[] tableDeck, int[] player1deck, int[] player2deck, int player1turn, int player2turn)
	{
		setServerDeck(serverDeck);
		setP1cards(player1cards);
		setP2cards(player2cards);
		setTableDeck(tableDeck);
		setP1Deck(player1deck);
		setP2Deck(player2deck);
		setP1turn(player1turn);
		setP2turn(player2turn);
		
	}
}
