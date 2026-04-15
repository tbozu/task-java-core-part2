package org.example;

import java.util.HashMap;
import java.util.Map;

public class CollectionPartOne {

    public String removeAllSymbols(){
        SongText songText = new SongText();
        String textBeforeChange = songText.getSongText().toString();

        return textBeforeChange.replace(",","")
                .replace("\n"," ")
                .replace("(","")
                .replace(")","").toLowerCase();
    }

    public String[] addStringInArrayString(){
        String[] arrayString = removeAllSymbols().trim().split("\\s+");
        return arrayString;
    }

    public Map countHowManyTimesAppearedInArray(){
        addStringInArrayString();
        Map<String,Integer> mapWithString = new HashMap<>();

        for (String word : addStringInArrayString()) {
            mapWithString.put(word, mapWithString.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry coutWords: mapWithString.entrySet()){
            System.out.println(coutWords.getKey()+ " -> " + coutWords.getValue());
        }

        return mapWithString;

    }
}
