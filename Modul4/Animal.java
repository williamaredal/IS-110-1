
/**
 *
 * @author William
 * @version 1
 */
public class Animal
{
    private boolean isHungry;
    private boolean isThirsty;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(boolean isThirsty)
    {
        this.isHungry = false;
        this.isThirsty = isThirsty;
        System.out.println("Im hungry and thirsty");
    }

    public void eatIfHungry(){
        if (this.isHungry) {
            System.out.println("NomNom");
            this.isHungry = false;
        } else {
            System.out.println("Im not hungry...");
        }

    }

    public void becomeHungry(){
        if (this.isHungry == true) {
            System.out.println("Im already hungry, stop reminding me...");
        } else {
            this.isHungry = true;
            System.out.println("Now im hungry");
        }
    }

    public void eat() {
        System.out.println("Eating");
    }


}
