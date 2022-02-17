import java.util.ArrayList;

/**
 * A pokedex for keeping track of all your pokemons.
 *
 * @author William
 * @version 1
 */
public class Pokedex
{
    private ArrayList<Pokemon> myPokedex;

    /**
     * Constructor for objects of class Pokedex
     */
    public Pokedex()
    {
        myPokedex = new ArrayList<Pokemon>();
    }

    /**
     * A method for adding a pokemon to myPokeDex
     *
     * @param  name,pokemonType,lvl the fields of the pokemon
     * @adds the new pokemon to myPokedex
     */
    public void addPokemon(String name, String pokemonType, int lvl)
    { 
        this.myPokedex.add(new Pokemon(name, pokemonType, lvl));
        System.out.println("The pokemon was added to your pokedex");
    }

    public void showPokemons(){
        for (Pokemon pokemon : myPokedex) {
            System.out.println(pokemon.getPokemonInfo("name"));
            System.out.println(pokemon.getPokemonInfo("type"));
            System.out.println(pokemon.getPokemonInfo("lvl"));
        }
    }
}
