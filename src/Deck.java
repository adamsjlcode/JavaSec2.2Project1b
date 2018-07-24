import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * ---------------------------------------------------------------------------
 * File name: Deck.java
 * Project name: Project1a
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Deck of cards object
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class Deck
{
	
	Card[] deck;	/** The deck. */

	int next;	/** The next card. */
	
	/**
	 * Instantiates a new deck.
	 */
	public Deck ( )
	{
		deck = new Card[52];
		for(int i = 0 ; i < 52 ; i++)
		{
			deck[i] = new Card(i);
		}
		next = 0;
		
	}//End Deck ( ) 
	
	/**
	 * Instantiates a new deck.
	 *
	 * @param existingDeck the existing deck
	 */
	public Deck (Deck existingDeck)
	{
		deck = new Card[52];
		for(int i = 0 ; i < 52 ; i++)
		{
			deck[i] = existingDeck.deck[i];
		}
		next = 0;
		
	}//End Deck (Deck)
	
	/**
	 * Shuffle.
	 */
	public void shuffle ()
	{
		Random rdm = new Random();
		int iNewCard;
		for(int i = 51 ; i > 0 ; i--)
		{
			iNewCard = rdm.nextInt(i);
			Card temp = deck[iNewCard];
			deck[iNewCard] = deck[i];
			deck[i] = temp;
		}
		next = 0;
		
	}//End shuffle (Card[])
	
	/**
	 * Deal A card.
	 *
	 * @return the card
	 */
	public Card dealACard ( )
	{
		if(cardsLeft() != 52)
		{
			next++;
			return deck[next];
		}
		return null;
		
	}//End dealACard ( )
	
	/**
	 * Deal A hand.
	 *
	 * @param handSize the hand size
	 * @return the string
	 */
	public Hand dealAHand (int handSize)
	{
		Hand hand = new Hand(handSize);
		for (int i = 0; i < handSize; i++ )
		{
			hand.addCard (dealACard());
		}
		return hand;
		
	}//End dealAHand (int)
	
	/**
	 * Cards left.
	 *
	 * @return the int
	 */
	public int cardsLeft ( )
	{
		return next;
		
	}//End cardsLeft ( )
	
	/**
	 * toString method         
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String temp = "";
		for (int i = 0; i < deck.length; i++ )
		{
			temp  +=  ((i+1) + " " + deck[i] + "\n");
		}
		return temp;
		
	}//End toString ( )
	
	
}//End Deck
