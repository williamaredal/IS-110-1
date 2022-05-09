package Modul1til3;

/**
 * @author William
 * @version 1
 */
public class CarFactory
{
    public Car dollysBil;

    /**
     * Constructor for objects of class CarFactory
     */
    public CarFactory()
    {
        // initialise instance variables
        dollysBil = new Car(114);
        
    }

    /**
     * Method that gets the carNumber of the object "donaldsBil"
     * @calls HvilketBilNummer from Car object
     */
    public void getCarNumber(){
        dollysBil.WhatCarNumber();
    }

    /**
     * Method produces a new car
     * @calls HvilketBilNummer from Car object
     */
    public void ProduceNewCar(int carNumber){
        
        Car myCar = new Car(carNumber);
        myCar.WhatCarNumber();

    }
}
