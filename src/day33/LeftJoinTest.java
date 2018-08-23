package day33;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    void leftJoinSmallTestTrue() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("fond", "enamored");
//        map1.put("wrath", "anger");
//        map1.put("diligent", "employed");
//        map1.put("outfit", "garb");
//        map1.put("guide", "usher");
//        System.out.println("Map 1 = " + map1);
        System.out.println("Map 1 KeySet = " + map1.keySet());

        Map<String, String> map2 = new HashMap<>();
        map2.put("fond", "averse");
//        map2.put("wrath", "delight");
//        map2.put("diligent", "idle");
//        map2.put("guide", "follow");
//        map2.put("flow", "jam");
        System.out.println("Map 2 = " + map2);


        String actual = String.valueOf(LeftJoin.leftJoin(map1, map2));
        String expected = "{fond=[enamored, averse]}";

        assertEquals(expected, actual);
    }

    @Test
    void leftJoinEmptyJoin() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("fond", "enamored");
        System.out.println("Map 1 KeySet = " + map1.keySet());

        Map<String, String> map2 = new HashMap<>();
        System.out.println("Map 2 = " + map2);


        String actual = String.valueOf(LeftJoin.leftJoin(map1, map2));
        String expected = "{}";

        assertEquals(expected, actual);
    }

    @Test
    void leftJoinTwoKey() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        System.out.println("Map 1 KeySet = " + map1.keySet());

        Map<String, String> map2 = new HashMap<>();
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        System.out.println("Map 2 = " + map2);


        String actual = String.valueOf(LeftJoin.leftJoin(map1, map2));
        String expected = "{wrath=[anger, delight], fond=[enamored, averse]}";

        assertEquals(expected, actual);
    }
}