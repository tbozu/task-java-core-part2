package test;

import org.example.CollectionPartThree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class testCollectionPartThree {

    CollectionPartThree collectionPartThree = new CollectionPartThree();


    @Test
    public void checkIfRemoveSpecificStringWord(){
        List<String> listTestString = collectionPartThree.removeSpecificString();
        Iterator<String> it = listTestString.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            Assert.assertNotEquals("submarine",it.next().equals("submarine"));
            Assert.assertNotEquals("yellow",it.next().equals("yellow"));
        }

    }



}
