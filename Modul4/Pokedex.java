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
        this.myPokedex.add(new Pokemon("Squirtle", "water", 3));
        this.myPokedex.add(new Pokemon("Charmander", "fire", 3));
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

    public void findPokemon(String name){
        for (Pokemon currentPokemon : myPokedex) {

            // er pokemonen den vi leter etter?
            if (currentPokemon.getPokemonInfo("name") == name) {
                System.out.println("The pokemon is in the pokedex!");
            }

            // er den ikke det?
        }
    }

    public void removePokemon(String name){
        int i = 0;
        while (i < myPokedex.size()) {
            if (myPokedex.get(i).getPokemonInfo("name") == name) {
                myPokedex.remove(i);
            } 
            
            i++;
        }
    }

    public void showPokemons(){
        for (Pokemon pokemon : myPokedex) {
            System.out.println(pokemon.getPokemonInfo("name"));
            System.out.println(pokemon.getPokemonInfo("type"));
            System.out.println(pokemon.getPokemonInfo("lvl"));
        }
    }
}
