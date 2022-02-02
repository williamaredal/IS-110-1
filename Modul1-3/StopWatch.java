
/**
 * StopWatch is a class that tracks time like a stopwatch.
 *
 * @author William
 * @version 1
 */
public class StopWatch
{

    public int minute;
    public int second;
    public NumberViewer minuteTracker;
    public NumberViewer secondTracker;
    /**
     * Constructor for objects of class Clock
     */
    public StopWatch()
    {
        // initialise instance variables
        minute = 0;
        second = 0;
        minuteTracker = new NumberViewer(60, minute);
        secondTracker = new NumberViewer(60, second);
        
        // starts StopWatch
        RunStopWatch();
    }

    /**
     * A function for starting the StopWatch
     *
     * Starts running the stopwatch keeping track of time
     * while displaying the time underway.
     */
    public void RunStopWatch(){
        while (minute < 1) {
            try {
                Thread.sleep(1000);

                // increments to next minute, else increments second alone
                if (secondTracker.getTime() == 59) {
                    secondTracker.Increment();
                    minuteTracker.Increment();

                    second = secondTracker.getTime();
                    minute = minuteTracker.getTime();
                    DisplayTime();

                } else {
                    secondTracker.Increment();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            

            
        }
    }

    /**
     * A function for displaying the StopWatch time 
     *
     * @field minute
     * @field second
     * @return the current minute and second in string format
     */
    public String DisplayTime(){
        String timeString = "" + minute + ":" + second;
        return timeString;
    }

}
