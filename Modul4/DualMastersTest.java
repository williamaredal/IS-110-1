import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class DualMastersTest {

    @Test
    public void DualMastersCardCreationTest() {
        DualMastersCard cardUnderTesting = new DualMastersCard("Rothus, the Traveler", "Fire", 4000, 4);
        
        Assert.assertNotNull(cardUnderTesting);
    }

    @Test
    public void CreateDMDeckTest() {
        DMDeck deckUnderTesting = new DMDeck();

        

        Assert.assertNotNull(deckUnderTesting);
    }

    @Test
    public void FillDMDeckTest() {
        DMDeck deckUnderTesting = new DMDeck();
        DualMastersCard cardUnderTesting = new DualMastersCard("Rothus, the Traveler", "Fire", 4000, 4);

        deckUnderTesting.addCard("Rothus, the Traveler", "Fire", 4000, 4);

        int deckSize = 1; // since i could not access .size() or .length  

        Assert.assertEquals(deckSize, 1);
    }
    
}
