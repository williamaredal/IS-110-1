package Modul10til12;

/**
 *
 * @author William
 * @version 1
 */
public interface Herbivore
{

    /**
     *
     * the herbivore attacks another herbivore that is encroaching on their territory
     */
    void attack(String target);

    /**
     *
     * the herbivore defends agains another herbivore or carnivore
     */
    void defend(String target);
}
