package Modul14;
import java.util.HashMap;
import java.util.Random;

import javax.management.openmbean.KeyAlreadyExistsException;

import java.lang.String;
import java.security.KeyException;

/**
 * A class for storing random info in a hashmap.
 * 
 * @author William
 * @version 1
 */
public class HashStorage
{
    private HashMap<String, String> myHashMap;
    private String key1;
    private String key2;
    

    /**
     * Constructor for objects of class HashStorage
     */
    public HashStorage()
    {
        myHashMap = new HashMap<>();
        this.key1 = "Watt";
        this.key2 = "Kilo";
        this.myHashMap.put(key1, "22");
        this.myHashMap.put(key2, "42");
        
    }

    /**
     * 
     * @returns None
     * @param String nameToAdd, this is the name you want to be the key in the hashmap
     */
    public void addHashPair(String nameToAdd) {

        // defensive programming that prevents user input of parameter that will cause problems
        try {
            if (nameToAdd == null) {
                throw new KeyException("This key is not allowed");
            }
            if (myHashMap.containsKey(nameToAdd)) {
                throw new KeyAlreadyExistsException("This key already exists");
            }
            if (nameToAdd == "exception") {
                throw new Exception("This string is not allowed");
            } else {
                Random newRandom = new Random();
                String newRandomString = "" + newRandom.nextInt(100);
                myHashMap.put(nameToAdd, newRandomString);
                System.out.println("Added " + nameToAdd + " to the hashMmap");
            }
        }
        catch (Exception e) {
            System.out.println("There was a problem adding this key");
            System.out.println(e);

        }

    }

    public void getHashPair(String nameToGet) {
        if (myHashMap.containsKey(nameToGet) && nameToGet != null) {
            System.out.println(myHashMap.get(nameToGet));
        } else {
            System.out.println("Invalid key given, or not a key in hashmap");
        }

    }

}
