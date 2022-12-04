package slapjackLogic;

import java.util.Arrays;


import java.util.Random;

public class slapjackLogic{

	private int[] serverDeck;
	
	//score counter
	private int player1score = 0;
	private int player2score = 0;
	
	//Deck on table, -1 means no cards there
	private int[] tableDeck = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	//player decks, size of 5 ints, initial deck
	private int[] player1deck;
	private int[] player2deck;
	
	//players deck after claiming cards after a slap
	private int[] player1deckSlap = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] player2deckSlap = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	//increments each time a player plays, total of 5
	private int player1turn = 0;
	private int player2turn = 0;
	
	public void player1JackSlap()
	{
		//Player 1 successfuly slaps a jack
		System.out.println("Player 1 slaps a jack.\n");
		
		//add all cards on the table to the player's deck

		//get the size of the tableDeck
		int tableDeckSize = 0; 
		for(int i = 0; i < 10;i++)
		{
			if(tableDeck[i] != -1)
			{
				++tableDeckSize;
			}
		}
		
		//get the size of the tableDeck
		int player1deckSlapSize = 0; 
				for(int i = 0; i < 10;i++)
				{
					if(player1deckSlap[i] != -1)
					{
						++player1deckSlapSize;
					}
				}
				
		         
				int x = 0;
				for(int i = player1deckSlapSize; i < 10; i++)
				{
					if(player1deckSlap[i] == -1)
					{   //give player 1 the card on the table
						player1deckSlap[i] = tableDeck[x];
						
					
						//take away that same card from the table deck
						tableDeck[x] = -1;
						
						//increment for the table deck
						++x;
					}
				}

		
		//Display the player 1 new deck 
		System.out.println("Player1deckSlap: " + Arrays.toString(this.player1deckSlap));
		
		//Display the table deck after player 1 slap
		System.out.println("Table deck: " + Arrays.toString(this.tableDeck));
		
	}
	
	public void player2JackSlap()
	{
		//Player 2 successfuly slaps a jack
		System.out.println("Player 2 slaps a jack.\n");
				
		
		//add all cards on the table to the player's deck

		//get the size of the tableDeck
		int tableDeckSize = 0; 
		for(int i = 0; i < 10;i++)
		{
			if(tableDeck[i] != -1)
			{
				++tableDeckSize;
			}
		}
		
		//get the size of the tableDeck
		int player2deckSlapSize = 0; 
				for(int i = 0; i < 10;i++)
				{
					if(player2deckSlap[i] != -1)
					{
						++player2deckSlapSize;
					}
				}
				
		         
				int x = 0;
				for(int i = player2deckSlapSize; i < 10; i++)
				{
					if(player2deckSlap[i] == -1)
					{   //give player 1 the card on the table
						player2deckSlap[i] = tableDeck[x];
						
					
						//take away that same card from the table deck
						tableDeck[x] = -1;
						
						//increment for the table deck
						++x;
					}
				}

		
		//Display the player 1 new deck 
		System.out.println("Player2deckSlap: " + Arrays.toString(this.player2deckSlap));
		
		//Display the table deck after player 1 slap
		System.out.println("Table deck: " + Arrays.toString(this.tableDeck));
		
	}
	
	//player 1 turn, places card on table
	public void player1play()
	{
		//add the card to the table deck
		addCardToTableDeck(this.player1deck[player1turn]);
		
		//take that card out of the player's deck
		player1deck[player1turn] = -1;
		
		//increment number of turns
		++player1turn;
	}
	
	
	//player 1 turn, places card on table
	public void player2play()
	{
		//add the card to the table deck
		addCardToTableDeck(this.player2deck[player2turn]);
				
		//take that card out of the player's deck
		player2deck[player2turn] = -1;
		
		//increment number of turns
		++player2turn;
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
		
		System.out.println("Card added to table deck. Deck: " + Arrays.toString(this.tableDeck));
	}
	
	
	//creates an array of numbers, each number representing a card
	public void createServerDeck()
	{
		//create the deck, 10 cards
		int[] deck = {0,1,2,3,4,5,6,7,8,9};
		

		//randomize the deck
		Random rgen = new Random();  // Random number generator			
		
				for (int i=0; i<deck.length; i++) {
				    int randomPosition = rgen.nextInt(deck.length);
				    int temp = deck[i];
				    deck[i] = deck[randomPosition];
				    deck[randomPosition] = temp;
				}
		
		System.out.println("Deck:" + Arrays.toString(deck)+"\n");
		
		
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
		System.out.println("Player 2 deck: " + Arrays.toString(player2deck)+"\n");
				
		return player2deck;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slapjackLogic gamePanel = new slapjackLogic();
		
		//create the server deck
		gamePanel.createServerDeck();
		
		//create the player decks
		gamePanel.createPlayer1Deck();
		gamePanel.createPlayer2Deck();
		
		System.out.println("------------------------------------------------------");
		
		//loop to run 5 times, there are only 5 rounds
		System.out.println("Each player takes a turn, table deck gets cards:");
		for(int i = 0; i <= 4; i++)
		{
			gamePanel.player1play();
			gamePanel.player2play();
		}
		
		System.out.println("\n");
		
		System.out.println("------------------------------------------------------");
		
		//player 1 slaps a jack, gets the cards all on table
		gamePanel.player1JackSlap();
	}
	

}
