import java.util.ArrayList;

/**
 * Write a description of class Dyrepark here.
 *
 * @author William
 * @version 1
 */
public class Dyrepark
{
    private ArrayList park;

    /**
     * Constructor for objects of class Dyrepark
     */
    public Dyrepark()
    {
        Animal pluto = new Dog("Pluto");
        Animal pluto2 = new Dog("Pluto");
        Animal pluto3 = pluto2;
        Animal wiskers = new Cat("Wiskers", 2);


        park = new ArrayList<>();

        park.add(pluto);
        park.add(wiskers);

        if (pluto.equals(pluto2)) {
            System.out.println("Similar ==");
        } else {
            System.out.println("Not similar =/=");
        }
    }
    

}
