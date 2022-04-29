
/**
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
        super(true);
        this.name = name;
        
    }

    public void bark() {
        System.out.println("VOOF!");
    }

    public String getMyName() {
        return this.name;
    }

    public void eat(){
        System.out.println("I dont need to eat");
        super.eat();
    }

    public boolean equals(Object compareObject) {
        // the object is the same as this
        if (this == compareObject) {
            return true;
        }
        if (compareObject instanceof Dog) {
            // gets fields from comparison object and returns true if fields contain the same
            Dog other = (Dog) compareObject;
            return name.equals(other.name);
        } else {
            return false;
        }
    }

    public int hashCode(Object compareObject) {
        int returnValue = 69;
        returnValue = 69 * returnValue + name.hashCode();
        return returnValue;
    }
}
