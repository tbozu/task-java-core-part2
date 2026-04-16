package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexTopic {

    private StringRegex stringRegex = new StringRegex();

    public Boolean stringContainsOrderUUID(){

        Pattern pattern = Pattern.compile("orderUUID=([0-9a-fA-F\\-]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher =  pattern.matcher(stringRegex.getStringForTaskOneAndTwo());

        boolean checkIfStringContains = matcher.find();
        if(checkIfStringContains){
            return true;
        }else{
            return false;
        }
    }

    public String returnStringSubstring() throws StringException {
        String text = stringRegex.getStringForTaskOneAndTwo();
        int startTheString = text.indexOf("orderUUID=");
        int finishTheString = text.indexOf("poNum");
        String stringAfterSubString = null;
        if (startTheString != -1) {
            int form = startTheString + "orderUUID=".length();
            System.out.println("This Stirng is exist:");
            stringAfterSubString = text.substring(form, finishTheString);
            return stringAfterSubString;
        } else {
            throw new StringException("This string don't exist or is empty:" + stringAfterSubString);
        }

    }

    public String returnUserEmail() throws EmailException{
        String userEmail = stringRegex.getStringForTaskThree();

        Pattern pattern = Pattern.compile("([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userEmail);

        if(matcher.find()){
            return matcher.group();
        }else{
            throw new EmailException();
        }
    }

    public int returnHowManyOrders() throws OrderException{
        Pattern pattern = Pattern.compile("\\[([0-9]+)\\]");
        Matcher matcher = pattern.matcher(stringRegex.getStringForTaskFour());
        if(matcher.find()){
            return Integer.valueOf(matcher.group(1));
        }else {
            throw new OrderException();
        }
    }
}
