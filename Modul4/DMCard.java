
/**
 * A Dualmaster card class.
 *
 * @author William
 * @version 1
 */
public class DMCard
{
    private String creatureName;
    private String creatureType;
    private int creaturePower;
    private int manaCost;

    /**
     * Constructor for objects of class DMCard
     */
    public DMCard(String cardName, String cardType, int cardPower, int cardCost)
    {
        this.creatureName = cardName;
        this.creatureType = cardType;
        this.creaturePower = cardPower;
        this.manaCost = cardCost;
    }

    /**
     * A method for showing the card information
     *
     */
    public void getCreatureInfo(String type)
    {
        if (type == "name") {
            System.out.println(this.creatureName);
        }
        else if (type == "type") {
            System.out.println(this.creatureType);
        }
        else if (type == "power") {
            System.out.println(this.creaturePower);
        }
        else if (type == "cost") {
            System.out.println(this.manaCost);
        }

    }
}
