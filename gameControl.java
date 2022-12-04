package slapJack;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class gameControl implements ActionListener {
	
	private JPanel container;
	private ChatClient client;
	
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
	
	
	public gameControl(JPanel container, ChatClient client) 
	{
		this.container = container;
	    this.client = client;
	}

	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command == "ready")
		{
			
		}
		
		else if(command == "slap")
		{
			
		}
		
		else if(command == "logout")
		{
			
		}
	}
	
	public void player1JackSlap()
	{
		//Player 1 successfuly slaps a jack
		System.out.println("Player 1 slaps a jack.");
		
		//add all cards on the table to the player's deck

		player1cards += getTableDeckSize();
		
		//reset the table deck, all cards gone
		for(int i = 0; i < 10; i++)
		{
		tableDeck[i] = -1;
		}
		
	}
	
	//add all cards on the table, to the players score count
	public void player2JackSlap()
	{
		//Player 2 successfuly slaps a jack
		System.out.println("Player 2 slaps a jack.\n");
		
		//add all cards on the table to the player's deck
		player2cards += getTableDeckSize();
		
		//reset the table deck, all cards gone
		for(int i = 0; i < 10; i++)
		{
		tableDeck[i] = -1;
		}
		
	}

	
	//get the size of the tableDeck
	public int getTableDeckSize()
	{
		
		int tableDeckSize = 0; 
		for(int i = 0; i < 10;i++)
			{
				if(tableDeck[i] != -1)
				{
					++tableDeckSize;
					}
				}
		return tableDeckSize;
	}
	
	//player 1 turn, places card on table
	public void player1turn()
	{
		//add the card to the table deck
		addCardToTableDeck(this.player1deck[player1turn]);
		
		System.out.println("Player 1 card added to table deck. Deck: " + Arrays.toString(this.tableDeck));
		
		//take that card out of the player's deck
		player1deck[player1turn] = -1;
		
		//increment number of turns
		++player1turn;
		
		//player plays a card
		--player1cards;
	}
	
	
	//player 1 turn, places card on table
	public void player2turn()
	{
		//add the card to the table deck
		addCardToTableDeck(this.player2deck[player2turn]);
				
		System.out.println("Player 2 card added to table deck. Deck: " + Arrays.toString(this.tableDeck)+"\n");
	
		//take that card out of the player's deck
		player2deck[player2turn] = -1;
		
		//increment number of turns
		++player2turn;
		
		//player plays a card
		--player2cards;
	}
	
	
	//function to add a card to the table deck
	public void addCardToTableDeck(int card)
	{
		
		int i = 0; 
		while(true)
		{
			if(this.tableDeck[i] == -1)
			{
				this.tableDeck[i] = card;
				break;	
			}
			++i;
		}
		
	}
	
	
	//creates an array of numbers, each number representing a card
	public void createServerDeck()
	{
		//create the deck, 10 cards
		int[] deck = {0,1,2,3,4,5,6,7,8,9};
		

		//randomize the deck
		Random rng = new Random();  // Random number generator			
		
				for (int i=0; i<deck.length; i++) {
				    int randomPosition = rng.nextInt(deck.length);
				    int temp = deck[i];
				    deck[i] = deck[randomPosition];
				    deck[randomPosition] = temp;
				}
		
		System.out.println("Server deck:" + Arrays.toString(deck)+"\n");
		
		
		serverDeck = deck;
		
	}
	
	
	//returns server deck
	public int[] getServerDeck()
	{
		return serverDeck;
	}
	
	
	//get the player 1 deck
	public int[] createPlayer1Deck()
	{
		//split the deck in two parts, split size is the index of half 
		int splitSize = serverDeck.length / 2;
		
		//assign first half to player 1 
		player1deck = Arrays.copyOfRange(serverDeck, 0, splitSize); //0 to middle
		System.out.println("Player 1 deck: " + Arrays.toString(player1deck)+"\n");
		
		return player1deck;
	}
	
	
	//returns player 2 deck
	public int[] createPlayer2Deck()
	{
		//split the deck in two parts, split size is the index of half 
		int splitSize = serverDeck.length / 2;
		
		//assign second half to player 2
		player2deck = Arrays.copyOfRange(serverDeck, splitSize, serverDeck.length); //middle to max
		player2deck[4] = 0;
		
		System.out.println("Player 2 deck: " + Arrays.toString(player2deck)+"\n");
				
		return player2deck;
	}
	
	public int getPlayer1Cards()
	{
		System.out.println("Player 1 cards: " + player1cards);
		return player1cards;
	}
	
	public int getPlayer2Cards()
	{
		System.out.println("Player 2 cards: " + player2cards);
		return player2cards;
	}
	
	public int[] getTableDeck()
	{
		System.out.println("Table deck: " + Arrays.toString(tableDeck)+"\n");
		return tableDeck;
	}
	
	public int[] getPlayer1Deck()
	{
		System.out.println("Player 1 deck: " + Arrays.toString(player1deck)+"\n");
		return player1deck;
	}
	
	public int[] getPlayer2Deck()
	{
		System.out.println("Player 2 deck: " + Arrays.toString(player2deck)+"\n");
		return player2deck;
	}
	
}
