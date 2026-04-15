package test;

import org.example.BeatlesException;
import org.example.CollectionPartFour;
import org.example.SongText;
import org.junit.Assert;
import org.junit.Test;

public class testCollectionPartFour {



    CollectionPartFour collectionPartFour = new CollectionPartFour();
    @Test
    public void checkIfTextIsReadFromFile(){
        collectionPartFour.readFile();
        SongText songText = new SongText();
        Assert.assertNotEquals(collectionPartFour.readFile(),songText.getSongText());
    }
    @Test
    public void checkIfCanFoundRandomString() throws BeatlesException {

        Assert.assertTrue(collectionPartFour.verifiedIfWordIsOnString(collectionPartFour.readFile(),"In the town where"),true);
        Assert.assertTrue(collectionPartFour.verifiedIfWordIsOnString(collectionPartFour.readFile(),"Yellow submarine, yellow submarine"),true);
    }
}
