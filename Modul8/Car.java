package Modul8;

/**
 * A Class for a car that can be parked in a parkinglot.
 *
 * @author William
 * @version 1
 */
public class Car
{

    private String registrationPlate;
    private Boolean parked;

    /**
     * Constructor for objects of class Car
     */
    public Car(String plate)
    {
        this.registrationPlate = plate;
        this.parked = false;
    }

    public String getPlate() {
        return this.registrationPlate;
    }

    public Boolean getParkedStatus() {
        return this.parked;
    }

    // method for parking car
    public void parkCar() {
        this.parked = true;
    }  

    // method for un-parking car
    public void unparkCar() {
        this.parked = false;
    }

    
}
