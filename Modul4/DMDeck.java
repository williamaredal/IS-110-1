import java.util.ArrayList;

/**
 * A class for building dual masters decks.
 *
 * @author William
 * @version 1
 */

/**
 * Læremål:
 * 1. skrive metode som setter inn, finner og fjerner
 * 2. bruke for each løkke
 * 3. bruke while løkke
 * 
 * Hva denne klassen trenger:
 * - en liste for objektene
 * - en metode for å legge til DualMastersCard objekter i listen
 * - en metode for å finne DualMastersCard i listen
 * - en metode for å fjerne DualMastersCard fra listen
 */

public class DMDeck
{
    private ArrayList<DualMastersCard> myDeck;

    /**
     * Constructor for objects of class DMDeck
     */
    public DMDeck()
    {
        myDeck = new ArrayList<>();
        this.myDeck.add(new DualMastersCard("name1", "red", 1000, 1));
        this.myDeck.add(new DualMastersCard("name2", "blue", 3000, 4));
        this.myDeck.add(new DualMastersCard("name3", "black", 2000, 1));
    }

    public void addCard(String name, String type, int power, int manaCost) {
        this.myDeck.add(new DualMastersCard(name, type, power, manaCost));
    }

    public void findCard(String name) {
        for (DualMastersCard currentCard : myDeck) {
            if (currentCard.getCardInfo("name") == name) {
                System.out.println("The card is in the deck!");
            }

        }
    }

    public void removeCard(String name) {
        int i = 0;

        while (i < myDeck.size()) {

            if (myDeck.get(i).getCardInfo("name") == name) {
                this.myDeck.remove(i);
            }

            i++;
        }
    }

}
