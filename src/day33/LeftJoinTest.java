package day33;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    void leftJoinTest() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        map1.put("diligent", "employed");
        map1.put("outfit", "garb");
        map1.put("guide", "usher");

        Map<String, String> map2 = new HashMap<>();
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        String actual = LeftJoin.leftJoin(map1, map2);
        String expected = "";

        assertEquals(expected, actual);
    }
}