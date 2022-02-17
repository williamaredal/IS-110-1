import java.util.ArrayList;

/**
 * A Dualmaster deck class.
 *
 * @author William
 * @version 1
 */
public class DualMastersDeck
{
    private ArrayList<DMCard> myDeck;

    /**
     * Constructor for objects of class DualMastersDeck
     */
    public DualMastersDeck()
    {
        myDeck = new ArrayList<>();
    }

    /**
     * A method for adding a DM card to the deck.
     *
     */
    public void addCard(String name, String type, int power, int cost)
    {
        myDeck.add(new DMCard(name, type, power, cost));
    }

    public void showDeck() {
        for (DMCard card : myDeck) {
            card.getCreatureInfo("name");
            card.getCreatureInfo("type");
            card.getCreatureInfo("power");
            card.getCreatureInfo("cost");
        }
    }
}
