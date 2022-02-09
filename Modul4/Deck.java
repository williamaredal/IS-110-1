import java.util.ArrayList;

/**
 * A Class for creating Array lists of cards using Card.
 *
 * @author William
 * @version 1
 */
public class Deck
{
    private ArrayList<Card> fullDeck;
    private String[] cardTypes;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        fullDeck = new ArrayList<>();
        cardTypes = new String[] {"spades", "diamonds", "hearts", "clubs"};
    }

    /**
     * This method fills the deck with cards, if it's not filled already.
     *
     */
    public void FillDeck()
    {   
        if (fullDeck.size() > 0) {
            System.out.println("The deck is already filled");
        } else {
            // Fills deck from 1 (ace) to 13 (king)
            for (int i = 1; i <= 13; i++) {

                // Fills deck with 4 cards of each type of card
                for (String cardType : cardTypes) {
                    fullDeck.add(new Card(i, cardType));
                }
            }
        }


    }

    public void ShowDeck(){
        if (fullDeck.size() <= 0) {
            System.out.println("The deck is not filled");
        } else {
            for (Card card : fullDeck) {
                card.DisplayCard();
            }
        }

    }
}
