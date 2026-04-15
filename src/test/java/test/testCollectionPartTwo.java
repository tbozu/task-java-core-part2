package test;

import org.example.CollectionPartTwo;
import org.junit.Test;

public class testCollectionPartTwo {
    CollectionPartTwo collectionPartTwo = new CollectionPartTwo();

    @Test
    public void checkIfElementsFromArrayPutOnList(){
        collectionPartTwo.convertFromArrayToList();
    }

    @Test
    public void checkIfRemoveAllDublicates(){
        collectionPartTwo.removeAllDublicates();

    }

    @Test
    public void checkIfArrayIsSorted(){
        collectionPartTwo.sortWordsByLenght();
    }
}
