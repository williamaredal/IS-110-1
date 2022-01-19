
/**
 * A "PrivateDatabase" that illustrates the use cases of "getters" and "setters".
 * With this class the information that is in fields "firstName" and "lastName"
 * are kept private.
 * To access these a method, e.g. with authentication, could be made that regulates
 * who can access, and what is exchanged.
 *
 * @author (William)
 * @version (1)
 */
public class PrivateDatabase
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;

    /**
     * Constructor for objects of class PrivateDatabase
     */
    public PrivateDatabase()
    {
        // initialise instance variables
        firstName = "Kari";
        lastName = "Nordmann";
    }

    /**
     * A "getter" function that allows access to private fields in an object
     *  
     * @return    firstName
     */
    public String GetFirstName()
    {
        return firstName;
    }
    
    /**
     * A "getter" function that allows access to private fields in an object
     *
     * @return    lastName
     */
    public String GetLastName()
    {
        return lastName;
    }
    
    /**
     * A "setter" function that allows access to private fields in an object.
     * In this context by being able to set these to a desired variable in this object
     *
     * @param     newFirstName
     * @sets      this.firstName to newFirstName
     */
    public void SetFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    /**
     * A "setter" function that allows access to private fields in an object.
     * In this context by being able to set these to a desired variable in this object
     *
     * @param     newLastName
     * @sets      this.LastName to newLastName
     */
    public void SetLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    
}
