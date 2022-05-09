package Modul9;

/**
 * A pokemon class.
 *
 * @author William
 * @version 1
 */
public class Pokemon
{
    private String pokemonName;
    private String pokemonType;
    private int lvl;
    private String info;


    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon(String name, String elementType, int newLvl)
    {
        this.pokemonName = name;
        this.pokemonType = elementType;
        this.lvl = newLvl;
    }

    /**
     * A method for getting specific info about the pokemon
     *
     * @param  type the type of info you want shown
     * @return    the information field you requested
     */
    public String getPokemonInfo(String type)
    {
        info = "";
        
        if (type == "name") {
            info = this.pokemonName;
        }
        else if (type == "type") {
            info = this.pokemonType;
        }
        else if (type == "lvl") {
            info = "" + this.lvl;
        }

        return info;
    }
}
