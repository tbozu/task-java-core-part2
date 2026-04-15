package org.example;

import java.io.*;
import java.util.Objects;

public class CollectionPartFour {

    public String readFile() {
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        (getClass().getResourceAsStream("/SongTextBeatles.txt"))))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line).append(" ");
            }
} catch (IOException e) {
            System.out.println("Error can't find this file!!!");
        }

        return stringBuffer.toString();
    }
    public String verifiedIfWordIsOnString(String songText,String wordForVerification) throws BeatlesException {

        if(!songText.contains(wordForVerification)){
            throw new BeatlesException("This string isn't exist: "+wordForVerification);
        }
        return wordForVerification;
    }
}
