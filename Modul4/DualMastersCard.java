
/**
 * A class for dual masters cards.
 *
 * @author William
 * @version 1
 */

public class DualMastersCard
{
    private String cardName;
    private String cardType;
    private int cardPower;
    private int cardManaCost;

    /**
     * Constructor for objects of class DualMastersCard
     */
    public DualMastersCard(String name, String type, int power, int manaCost)
    {
        this.cardName = name;
        this.cardType = type;
        this.cardPower = power;
        this.cardManaCost = manaCost;
    }

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
