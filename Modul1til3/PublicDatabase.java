package Modul1til3;

/**
 * A "PublicDatabase" that further illustrates the use cases of "getters" and "setters".
 *
 * @author (William)
 * @version (1) 
 */
public class PublicDatabase
{
    // instance variables - replace the example below with your own
    public String publicFirstName;
    public String publicLastName;

    /**
     * Constructor for objects of class PublicDatabase
     */
    public PublicDatabase()
    {
        // initialise instance variables
        publicFirstName = "Kari";
        publicLastName = "Nordmann";
    }

    
    /**
     * A "getter" function that accesses the already public field "publicFirstName"
     *  
     * @return    publicFirstName
     */
    public String getpublicFirstName()
    {
        return publicFirstName;
    }
    
    /**
     * A "getter" function that accesses the already public field "publicLastName"
     *
     * @return    publicLastName
     */
    public String getpublicLastName()
    {
        return publicLastName;
    }
    
    /**
     * A "setter" function that can change the public fields.
     * In this context by being able to set these to a desired variable in this object
     *
     * @param     newpublicFirstName
     * @sets      this.publicFirstName to newpublicFirstName
     */
    public void setpublicFirstName(String newpublicFirstName)
    {
        this.publicFirstName = newpublicFirstName;
    }
    
    /**
     * A "setter" function that allows access to private fields in an object.
     * In this context by being able to set these to a desired variable in this object
     *
     * @param     newpublicLastName
     * @sets      this.publicLastName to newpublicLastName
     */
    public void setpublicLastName(String newpublicLastName)
    {
        this.publicLastName = newpublicLastName;
    }
}
