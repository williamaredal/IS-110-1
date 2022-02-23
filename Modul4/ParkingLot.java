import java.util.ArrayList;

/**
 * A Class for managing a parking lot.
 *
 * @author William
 * @version 1
 */
public class ParkingLot
{

    private Car[] parkingLot;
    private ArrayList<Ticket> parkingTickets;

    /**
     * Constructor for objects of class ParkingLot
     */
    public ParkingLot(int capacity)
    {
        parkingLot = new Car[capacity];
        parkingTickets = new ArrayList<Ticket>();
    }


    // method for parking car in a lot
    public void parkCar(String plate) {
        Car car = new Car(plate);

        for (int i = 0; i <= parkingLot.length; i++) {
            // parking lot is available
            if (parkingLot[i] == null) {
                car.parkCar();
                parkingLot[i] = car;

                break;
            }

            else if (i == parkingLot.length && parkingLot[i] != null) {
                System.out.println("Could not find an available parking lot.");
            }
        }

    }
    

    // method for un-parking car from a lot
    public void unparkCar(String plate) {

        for (int i = 0; i <= parkingLot.length; i++) {
            // finds the car to un-park
            if (parkingLot[i].getPlate() == plate) {
                parkingLot[i].unparkCar();
                parkingLot[i] = null;

                break;
            }

            else if (i == parkingLot.length && parkingLot[i].getPlate() != plate) {
                System.out.println("There is no car with this registration plate in this parking lot.");
            }
        }
    }

    // method for ticketing a car
    public void ticketCar(String poorDudePlate) {
        for (int i = 0; i <= parkingLot.length; i++) {
            System.out.println(parkingLot[i]);
            // finds the car of the poor dude about to get ticketed into bankrupcy
            if(parkingLot[i].getPlate() == poorDudePlate) {
                parkingTickets.add(new Ticket(poorDudePlate, 9001));

                break;
            }
        }
    }


}
