package Modul4;


/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int cardValue;
    private String cardType;

    /**
     * Constructor for objects of class Card
     */
    public Card(int newCardValue, String newCardType)
    {
        // initialise instance variables
        this.cardValue = newCardValue;
        this.cardType = newCardType;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void DisplayCard()
    {
        System.out.println(cardValue + cardType);
    }
}
