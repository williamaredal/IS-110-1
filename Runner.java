import Modul14.HashStorage;

import java.util.ArrayList;

import Modul10til12.Monkey;

/**
 * A class for importing the various modules and run them here. Alone, or in unison with other classes.
 * This is to make the interaction with classes simpler.
 */
public class Runner {
    public static void main(String[]args){
        System.out.println("Hello world");
        
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Post 1");
        myList.add("Post 2");
        myList.add("Post 3");
        myList.add("Post 4");
        myList.add("Post 5");
        myList.add("Post 6");
        myList.add("Post 7");
        myList.add("Post 8");
        myList.add("Post 9");
        myList.add("Post 10");
        myList.add("Post 11");
        myList.add("Post 12");
        myList.add("Post 13");

        // reverse fetch of last 10 items
        for (int i = myList.size() - 1; i > myList.size() - 11; i--) {
            System.out.println(myList.get(i));
        }

        System.out.println();

        // in order fetch of only last 10 items
        for (int i = myList.size() - 11; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        
        // modul 6
        //HashStorage hashTest = new HashStorage();
        //hashTest.addHashPair("Watson");
        //hashTest.getHashPair("Watson");
        //System.out.println(hashTest);

        // modul 10-12
        //Monkey testMonkey = new Monkey("Banana", true);

        //System.out.println(testMonkey);
    }
}
