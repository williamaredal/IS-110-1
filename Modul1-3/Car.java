
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int modelNumber;

    /**
     * Constructor for objects of class Car
     */
    public Car(int newModelNumber)
    {
        // initialise instance variables
        modelNumber = newModelNumber;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void WhatCarNumber()
    {
        // put your code here
        if (modelNumber == 113) {
            System.out.println("Nice! Du har Donald's bil");
        } else {
            System.out.println("Du lagde en bil med modelnummer: " + modelNumber);
        }
        
    }
}
