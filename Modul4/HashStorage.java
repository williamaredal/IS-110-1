import java.util.HashMap;
import java.util.Random;
import java.lang.String;

/**
 * A class for storing random info in a hashmap.
 * 
 * @author William
 * @version 1
 */
public class HashStorage
{
    private HashMap<String, String> myHashMap;
    

    /**
     * Constructor for objects of class HashStorage
     */
    public HashStorage()
    {
        myHashMap = new HashMap<>();
    }

    /**
     * 
     * @returns None
     * @param String nameToAdd, this is the name you want to be the key in the hashmap
     */
    public void addHashPair(String nameToAdd) {
        Random newRandom = new Random();
        String newRandomString = newRandom.toString();

        myHashMap.put(nameToAdd, newRandomString);
        System.out.println(myHashMap);
        System.out.println("Added " + nameToAdd + " to the hashMmap");
    }

    public void getHashPair(String nameToGet) {
        System.out.println(myHashMap.get(nameToGet));
    }

}
