package Modul9;



import static org.junit.Assert.assertEquals;

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
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    public void tearDown()
    {
    }

    public void MethodReturnsCorrectType()
    {
        Pokemon pokemon1 = new Pokemon("Squirtle", "Water", 1);
        assertEquals("Squirtle", pokemon1.getPokemonInfo("name"));
        assertEquals("Water", pokemon1.getPokemonInfo("type"));
    }
}

