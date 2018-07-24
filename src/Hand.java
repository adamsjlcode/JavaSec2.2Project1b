/**
 * ---------------------------------------------------------------------------
 * File name: Hand.java
 * Project name: Project1b
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Hand object for game 
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class Hand
{
	
	private int handSize;	/** The hand size. */
	
	private int cardsInHand;	/** The cards in hand. */
	
	private Card[] hand;	/** The hand. */
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017 .
	 */
	public Hand ( )
	{
		handSize = 5;
		cardsInHand = 0;
		hand = new Card[handSize];
		
	}//End Hand ( )
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017 .
	 *
	 * @param handSize the hand size
	 */
	public Hand (int handSize)
	{
		if(handSize < 52 || handSize > 1)
		{
			this.handSize = handSize;
			this.hand = new Card[handSize];
		}
 
	}//End Hand (int)

	/**
	 * Copy Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017 .
	 *
	 * @param hand the hand
	 */
	public Hand (Card [ ] hand)
	{
		this.hand = new Card[hand.length];
		cardsInHand = 0;
		for (Card element : hand)
		{
			addCard(element);
		}
		
	}//End Hand (Card)
	
	/**
	 * Adds the card.
	 *
	 * @param card the card
	 */
	public void addCard (Card card)
	{
		if (cardsInHand - handSize != 0)
		{
			hand[cardsInHand] = card;
			cardsInHand++;
		}
		
	}//End addCard (Card)

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
		String strHand = "";
		for (Card element : hand)
		{
			
			strHand += "\n" + element;
		}
		return strHand;	
		
	}//End toSting ( )

}//End Hand
