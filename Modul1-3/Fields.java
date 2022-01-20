
/**
 * A simple class for illustrating fields.
 *
 * @author (William)
 * @version (1)
 */
public class Fields
{
    // instance variables - replace the example below with your own
    public int field1;
    public String field2;
    public float field3;
    public boolean light;

    /**
     * Constructor for objects of class Fields
     */
    public Fields()
    {
        // initialise instance variables
        field1 = 0;
        field2 = "i am a string";
        field3 = 0.1f;
        light = false;
    }

    /**
     * A method for viewing the field values available in this class
     *
     * @param  field1, field2 and field3 
     * @return  one of the field values
     */
    public String ViewFields()
    {
        String fieldsToView = String.format("A string containing the field1: %d, field2: %s, and field3: %f", field1, field2, field3);
        // put your code here
        return fieldsToView;
    }
    
    /**
     * A method for viewing if the light is turned on or not
     *
     * @param  turnedOn
     * @return  tells you if the light is on or not
     */
    public String LightSwitch(boolean turnedOn)
    {
        String lightStatus = "";
        if (turnedOn) {
            lightStatus = "Light is turned on!";
            System.out.println(lightStatus);
        }
        else {
            lightStatus = "Light is off.";
        }
        return lightStatus;
    }
    
    /**
     * A method for changing the light status in this class
     *
     * @param  flickTo
     * 
     */
    void FlickLightSwitch(boolean flickTo)
    {
        if (light == flickTo) {
            // returns nothing
        }
        else {
            light = flickTo;
        }
        
    }
}
