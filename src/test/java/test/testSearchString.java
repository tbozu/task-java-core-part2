package test;

import org.example.JavaCore;
import org.junit.Test;

public class testSearchString {
    @Test
    public void checkIfSearchCorrectWords(){
        JavaCore javaCore = new JavaCore();
        javaCore.printAllWordWhatStartWithOnSpecificCharacters();
    }

}
