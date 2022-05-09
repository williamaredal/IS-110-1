package Modul10til12;

/**
 *
 * @author William
 * @version 1
 */
public abstract class Person
{
    protected int age;
    protected String name;
    

    /**
     * Constructor for objects of class Person
     */
    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }


    // this method should do x.
    public abstract void act();
}
