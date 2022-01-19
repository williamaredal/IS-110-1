
/**
 * A simple calculator using a java class.
 *
 * @author (William)
 * @version (1)
 */
public class Calculator
{
    private int state;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        state = 0;
    }

    /**
     * @param  x, y
     * A function for multiplying two numbers
     * @return    the product of x and y
     */
    public int MultiplyNumbers(int x, int y)
    {
        // simple function that returns the product of two whole numbers
        return x * y;
    }
    
    /**
     * @param  xf, yf
     * A function for multiplying two numbers with decimals.
     * Remember to include 'f' after the number if it's a float
     * to avoid confusion with double
     * @return    the product of x and y
     */
    public float MultiplyFloats(float x, float y)
    {
        // simple function that returns the product of two numbers with decimals
        return x * y;
    }
    
    /**
     * @param  x, y
     * A function for finding sum of two numbers.
     */
    public int AddNumbers(int x, int y)
    {
        // simple function that returns the sum of two numbers
        return x + y;
    }
}
