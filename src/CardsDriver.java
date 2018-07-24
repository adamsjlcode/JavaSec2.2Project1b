import java.util.Scanner;

/**
 * ---------------------------------------------------------------------------
 * File name: CardsDriver.java
 * Project name: Project1b
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Driver Program
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class CardsDriver
{

	/**
	 * Driver Program To Deal A Head Of Cards         
	 *
	 * <hr>
	 * Date created: Feb 25, 2016
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Deck deck = new Deck ( ); //Deck Of Cards
		
		int iHand; 				//Number In Hand
		
		int iPlayers; 			//Number Of Players
		
		int iCount; 			//Counter For Players And Cards Dealt
		
		Scanner kb = new Scanner (System.in);
		
		deck.shuffle ( );
		
		do
		{
			System.out.println ("How many cards are in one hand? ");
			try
			{
				iHand = kb.nextInt ( );
			}
			catch (Exception e)
			{
				System.out.println ("Try Again");
				iHand = -1;
			}
			System.out.println ("How many players are playing? ");
			iPlayers = kb.nextInt ( );
			if (iHand * iPlayers > 52)
			{
				System.out.println 
								("There are not enough cards.\nTry Again\n\n");
				iHand = -1;
				iPlayers = -1;
			} 
		}
		while (iHand < 1&& iPlayers < 1);
		iCount = iPlayers;
		for (int index = 0;index<iPlayers;index++)
		{
			System.out.println ("\nPlayer: " + iCount + deck.dealAHand (iHand));
			iCount--;
		}
	}//End main (String)

}//End CardDriver
