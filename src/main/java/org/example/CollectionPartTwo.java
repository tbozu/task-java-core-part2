package org.example;
import java.util.*;

public class CollectionPartTwo {

    public List convertFromArrayToList(){
        CollectionPartOne collectionPartOne = new CollectionPartOne();
        List<String> listWithStringWord = new LinkedList<>(Arrays.asList(collectionPartOne.addStringInArrayString()));
        return listWithStringWord;
    }

    public Set removeAllDublicates(){
        Set<String> setRemoveDublicates = new HashSet<>(List.copyOf(convertFromArrayToList()));
        return setRemoveDublicates;
    }

    public void sortWordsByLenght(){
        List<String> listStringAfterRemove = new ArrayList<>(Set.copyOf(removeAllDublicates()));
        listStringAfterRemove.sort(Comparator.comparingInt(String::length));

        Iterator<String> it = listStringAfterRemove.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
