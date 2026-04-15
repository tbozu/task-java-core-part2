package test;

import org.example.CollectionPartOne;
import org.example.SongText;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class testCollectionPartOne {

    CollectionPartOne collectionPartOne = new CollectionPartOne();

   @Test
    public void testIfSymbolsIsDeleted(){
        SongText textBeforeChange = new SongText();
       Assert.assertNotEquals(collectionPartOne.removeAllSymbols(),textBeforeChange.getSongText());
    }
    @Test
    public void testIfStringToConvertArrayString(){
       collectionPartOne.addStringInArrayString();
       Assert.assertTrue("This it's array:",collectionPartOne.addStringInArrayString().getClass().isArray());
    }

    @Test
    public void testHowManyTimesIsAppearedInArray(){
       Map<String,Integer> testMapWithValues = collectionPartOne.countHowManyTimesAppearedInArray();
           Assert.assertEquals(Integer.valueOf(1),testMapWithValues.get("who"));
           Assert.assertEquals(Integer.valueOf(3),testMapWithValues.get("full"));
           Assert.assertEquals(Integer.valueOf(1),testMapWithValues.get("drop"));
           Assert.assertEquals(Integer.valueOf(11),testMapWithValues.get("a"));

    }
}
