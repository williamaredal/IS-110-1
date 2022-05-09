import Modul14.HashStorage;
import Modul10til12.Monkey;

/**
 * A class for importing the various modules and run them here. Alone, or in unison with other classes.
 * This is to make the interaction with classes simpler.
 */
public class Runner {
    public static void main(String[]args){
        System.out.println("Hello world");
        
        HashStorage hashTest = new HashStorage();
        hashTest.addHashPair("Watson");
        hashTest.getHashPair("Watson");
        System.out.println(hashTest);

        Monkey testMonkey = new Monkey("Banana", true);

        System.out.println(testMonkey);
    }
}
