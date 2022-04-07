
/**
 * A class for duel masters cards.
 *
 * @author William
 * @version 1
 */

public class DuelMastersCard
{
    private String cardName;
    private String cardType;
    private int cardPower;
    private int cardManaCost;

    /**
     * Constructor for objects of class DuelMastersCard
     */
    public DuelMastersCard(String name, String type, int power, int manaCost)
    {
        this.cardName = name;
        this.cardType = type;
        this.cardPower = power;
        this.cardManaCost = manaCost;
    }
    //legge til kort typer (fire, water etc...) som arver fra denne klassen  

    public String getCardInfo(String type) {
        String results = "";

        if (type == "name") {
            results = this.cardName;
        }
        else if (type == "type") {
            results = this.cardType;
        }
        else if (type == "power") {
            results = "" + this.cardPower;
        }
        else if (type == "mana") {
            results = "" + this.cardManaCost;
        }
        
        return results;
    }


}
