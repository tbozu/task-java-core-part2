package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionPartThree {

    CollectionPartTwo collectionPartTwo = new CollectionPartTwo();

    public List removeSpecificString(){

        List<String> removeSpecificString = new LinkedList<>(collectionPartTwo.convertFromArrayToList());

        Iterator<String> it = removeSpecificString.iterator();
        while (it.hasNext()){
            String word = it.next();
            if(word.equals("yellow") || word.equals("submarine")){
                it.remove();
            }
        }
        return removeSpecificString;
    }
}
