package test;

import org.example.SetProblem;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class testCollectionPartFive {

    @Test
    public void checkIfSystemWorksFine(){

        Set<SetProblem.User> users = new HashSet<>();

        users.add(new SetProblem.User("Max", 27));

        users.add(new SetProblem.User("Veronika", 20));

        users.add(new SetProblem.User("Denis", 30));

        users.add(new SetProblem.User("Max", 27));



        if (users.size() == 3) {

            System.out.println("System works well!");

        } else {

            throw new RuntimeException("Users set size should be 3!");

        }

    }
}
