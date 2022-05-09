package Modul10til12;

/**
 *
 * @author William
 * @version 1
 */
public interface Carnivore
{

    /**
     *
     * the carnivore attacks another herbivore or carnivore
     */
    void ambush(String target);

    /**
     *
     * the herbivore defends agains another herbivore or carnivore
     */
    void defend(String target);
}
