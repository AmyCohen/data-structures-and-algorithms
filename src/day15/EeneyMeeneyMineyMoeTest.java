package day15;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class EeneyMeeneyMineyMoeTest{

    @Test
    void eeneyMeeneyMineyMoeParty() {
    EeneyMeeneyMineyMoe musicalChairs = new EeneyMeeneyMineyMoe();
        musicalChairs.add("Willie");
        musicalChairs.add("Goldie");
        musicalChairs.add("Billy");
        musicalChairs.add("Rita Mae");
        musicalChairs.add("Bobby Joe");

        String actual = musicalChairs.eeneyMeeneyMineyMoe(3);
        String expected = "[Rita Mae]";

        assertEquals(expected, actual);
    }

    @Test
    void noParty() {
        EeneyMeeneyMineyMoe musicalChairs = new EeneyMeeneyMineyMoe();

        String actual = musicalChairs.eeneyMeeneyMineyMoe(3);
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void partyOfOne() {
        EeneyMeeneyMineyMoe musicalChairs = new EeneyMeeneyMineyMoe();
        musicalChairs.add("me");

        String actual = musicalChairs.eeneyMeeneyMineyMoe(3);
        String expected = "[me]";

        assertEquals(expected, actual);
    }

    @Test
    void eeneyMeeneyMineyMoePartyPooper() {
        EeneyMeeneyMineyMoe musicalChairs = new EeneyMeeneyMineyMoe();
        musicalChairs.add("Willie");
        musicalChairs.add("Goldie");
        musicalChairs.add("Billy");
        musicalChairs.add("Rita Mae");
        musicalChairs.add("Bobby Joe");

        String actual = musicalChairs.eeneyMeeneyMineyMoe(1);
        String expected = "[Bobby Joe]";

        assertEquals(expected, actual);
    }

    /*
    Cannot divide by zero so zero was not tested as the number to count by
     */

}