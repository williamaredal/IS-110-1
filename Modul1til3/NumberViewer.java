package Modul1til3;

/**
 * NumberViewer is a module class of StopWatch that stores, increments and displays a timeNumber.
 *
 * @author William
 * @version 1
 */
public class NumberViewer
{
    
    private int numberLimit;
    private int timeNumber;
    /**
     * Constructor for objects of class NumberViewer
     */
    public NumberViewer(int timeLimit, int startTime)
    {
        numberLimit = timeLimit;
        timeNumber = startTime;
    }


    /**
     *  A getter for returning timeNumber
     * @gets the timeNumber
     */
    public int getTime(){
        return timeNumber;
    }

    /**
     *  A setter for setting timeNumber
     * @sets the timeNumber to a value
     */
    public void setTime(int newTime){
        timeNumber = newTime;
    }

    /**
     *  An incrementer for increasing the timeNumber
     * @increment the timeNumber by one, up to the numberLimit.
     *  If it reaches the number Limit, it goes back to 0. 
     */
    public void Increment(){
        timeNumber = (timeNumber + 1) % numberLimit;
    }

    /**
     *  A function for displaying the timeNuber
     * @displays the timeNumber
     */
    public String DisplayTime(){
        String timeString = "" + timeNumber;
        return timeString;
    }
}
