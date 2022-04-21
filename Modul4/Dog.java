
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    private String name;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name)
    {
        this.name = name;
    }

    public void bark() {
        System.out.println("VOOF!");
    }

    public String getMyName() {
        return this.name;
    }
}
