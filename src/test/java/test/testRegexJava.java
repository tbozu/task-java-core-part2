package test;

import org.example.EmailException;
import org.example.JavaRegexTopic;
import org.example.OrderException;
import org.example.StringException;
import org.junit.Assert;
import org.junit.Test;

public class testRegexJava {


    private JavaRegexTopic javaRegexTopic = new JavaRegexTopic();
    @Test
    public void checkIfStringContainsIfTrue() {

        if (javaRegexTopic.stringContainsOrderUUID() == true) {
            System.out.println("This string have your sentence!!!");
            Assert.assertTrue(javaRegexTopic.stringContainsOrderUUID());
        }else{
            System.out.println("This string don't have your sentence!!!");
            Assert.assertFalse(javaRegexTopic.stringContainsOrderUUID());
        }
    }

    @Test
    public void checkIfStringSubstring() throws StringException {
      javaRegexTopic.returnStringSubstring();
    }

    @Test
    public void checkIfUserEmailIsReturn() throws EmailException {
        Assert.assertEquals("test_email@griddynamics.com",javaRegexTopic.returnUserEmail());
    }
    @Test
    public void checkIfOrdersIsExists() throws OrderException {
        Assert.assertEquals(2,javaRegexTopic.returnHowManyOrders());
    }
}
