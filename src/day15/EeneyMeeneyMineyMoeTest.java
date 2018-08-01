package day15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static day15.EeneyMeeneyMineyMoe.eeneyMeeneyMineyMoe;
import static org.junit.jupiter.api.Assertions.*;

class EeneyMeeneyMineyMoeTest{

    @Test
    void eeneyMeeneyMineyMoeParty() {
        LinkedList<String> partiers = new LinkedList<>();
        partiers.add("Willie");
        partiers.add("Goldie");
        partiers.add("Billy");
        partiers.add("Rita Mae");
        partiers.add("Bobby Joe");

        String actual = eeneyMeeneyMineyMoe(partiers, 3);
        String expected = "[Rita Mae]";

        assertEquals(expected, actual);
    }

    @Test
    void noParty() {
        LinkedList<String> partiers = new LinkedList<>();

        String actual = eeneyMeeneyMineyMoe(partiers,3);
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void partyOfOne() {
        LinkedList<String> partiers = new LinkedList<>();
        partiers.add("me");

        String actual = eeneyMeeneyMineyMoe(partiers,3);
        String expected = "[me]";

        assertEquals(expected, actual);
    }

    @Test
    void PartyPooper() {
        LinkedList<String> partiers = new LinkedList<>();
        partiers.add("Willie");
        partiers.add("Goldie");
        partiers.add("Billy");
        partiers.add("Rita Mae");
        partiers.add("Bobby Joe");

        String actual = eeneyMeeneyMineyMoe(partiers, 1);
        String expected = "[Bobby Joe]";

        assertEquals(expected, actual);
    }

    /*
    Cannot divide by zero so zero was not tested as the number to count by
     */

}