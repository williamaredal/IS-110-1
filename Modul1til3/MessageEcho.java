package Modul1til3;

/**
 * This class lets you echo messages in funny ways
 *
 * @author (William)
 * @version (1)
 */
public class MessageEcho
{
    // instance variables - replace the example below with your own
    private String defaultMessage;

    /**
     * Constructor for objects of class MessageEcho
     */
    public MessageEcho()
    {
        // initialise instance variables
        defaultMessage = "echo (fainter) echo (fainter) echo";
    }
    
    /**
     * Method that echos the default message specified in the constructo
     */
    public String echo() {
        // simple function without input values that returns the defaultMessage in echo 'format'
        return defaultMessage;
    }
    
    /**
     * Method that "echos" a written message three times
     * 
     * @param   message
     * @return  message repeated 3 times
     */
    public String newEcho(String message)
    {
        // simple function that returns a custom message to echo
        return message + " (fainter) " + message + " (fainter) " + message;
    }
}
