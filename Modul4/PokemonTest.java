

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PokemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PokemonTest
{
    /**
     * Default constructor for test class PokemonTest
     */
    public PokemonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void CreatePokemon()
    {
        Pokemon pokemon1 = new Pokemon("Squirtle", "Water", 1);
        assertEquals("Squirtle", pokemon1.getPokemonInfo("name"));
        assertEquals("Water", pokemon1.getPokemonInfo("type"));
    }
}

