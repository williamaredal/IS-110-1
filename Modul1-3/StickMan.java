
/**
 * A class where you can make StickMan and make him do boring things.
 * Can you assembe the stickman in the correct order <|(:-))-|==< ?
 *
 * @author "William"
 * @version 1
 */
public class StickMan
{
    private String stickman;
    private String bed;

    /**
     * Constructor for objects of class StickMan
     */
    public StickMan()
    {
        // initialise instance variables
        stickman = "";
        bed = "|_____________";
    }


    /**
     * A method for adding Party Hat to stickman
     * 
     *
     * @param stickman  a sample parameter for a method
     * @sets the modified stringman
     */
    public void setPartyHat()
    {
        stickman = stickman + "<|";
    }

    /**
     * A method for adding Head to stickman
     *
     * @uses stickman  a sample parameter for a method
     * @sets the modified stringman
     */
    public void setHead()
    {
        stickman = stickman + "(:-))";
    }

    /**
     * A method for adding Body to stickman
     *
     * @uses stickman  a sample parameter for a method
     * @sets the modified stringman
     */
    public void setBody()
    {
        stickman = stickman + "-|==";
    }

    /**
     * A method for adding Legs to stickman
     *
     * @uses stickman  a sample parameter for a method
     * @sets the modified stringman
     */
    public void setLegs()
    {
        stickman = stickman + "<";
    }

    /**
     * A method for viewing the stickman
     *
     * @uses stickman  a sample parameter for a method
     * @return the current stringman
     */
    public String ViewStickman(){
        return stickman;
    }

    public void PutStickmanToBed(){
        System.out.println(stickman);
        System.out.println(bed);
    }
}
