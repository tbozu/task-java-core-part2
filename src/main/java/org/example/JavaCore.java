package org.example;


public class JavaCore {
    private TestForSearch testForSearch = new TestForSearch();

    public void printAllWordWhatStartWithOnSpecificCharacters(){
        String[] stringArrayWithWords = testForSearch.getTestStringForSearch().split(" ");

        for(String words:stringArrayWithWords){
            if(words.startsWith("de")){
                   String word =  words.replace(",","");
                    System.out.println(word);
            }
        }
    }
}
