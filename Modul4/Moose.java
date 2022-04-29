/**
 *
 * @author William
 * @version 1
 */
public class Moose extends Animal implements Herbivore 
{
    private String territory;

    /**
     * Constructor for objects of class Moose
     */
    public Moose(String territory, boolean isThirsty)
    {
        super(isThirsty);
        this.territory = territory;
    }

    public void attack(String target) {
        System.out.println("Attacked " + target);
    }

    public void defend(String attacker) {
        System.out.println("Defended against " + attacker);
    }

    public String getTerritory() {
        return this.territory;
    }
}
