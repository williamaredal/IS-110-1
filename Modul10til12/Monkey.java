package Modul10til12;

/**
 *
 * @author William
 * @version 1
 */
public class Monkey extends Animal implements Herbivore, Carnivore
{
    private String favouriteFood;

    /**
     * Constructor for objects of class Moose
     */
    public Monkey(String favouriteFood, boolean isThirsty)
    {
        super(isThirsty);
        this.favouriteFood = favouriteFood;
    }

    public void attack(String target) {
        System.out.println("Attacked " + target);
    }

    public void ambush(String target) {
        System.out.println("Ambushed " + target);
    }

    public void defend(String attacker) {
        System.out.println("Defended against " + attacker);
    }
}
