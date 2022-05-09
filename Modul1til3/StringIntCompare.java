package Modul1til3;

/**
 * This visualizes how strings and integers cannot be compared in Java, even if "N" == N.
 *
 * @author William
 * @version 1
 */
public class StringIntCompare
{
    private String myString;
    private int myInt;

    /**
     * Constructor for objects of class StringIntCompare
     */
    public StringIntCompare(String specifyString, int specifyInt)
    {
        myString = specifyString;
        myInt = specifyInt;
    }

    /**
     * Comparison method that converts int to string before comparing these.
     *
     * @return    boolean value of the comparison result
     */
    public boolean ComparePass(){
        System.out.println(myString == Integer.toString(myInt) ? "String is equal to int." : "String is not equal to int.");
        return myString == Integer.toString(myInt);
    }

    /**
     * Comparison method that does not convert int to string before comparing these.
     * This will return an error as int and string types cannot be compared
     *
     * @return    boolean value of the comparison result
     */
    public boolean CompareFail(){
        System.out.println(myString == ("" + myInt) ? "String is equal to int." : "String is not equal to int.");
        return myString == ("" + myInt);
    }
}
