package day33;

import java.util.*;

public class LeftJoin {

    public static Map<String, List<Object>> leftJoin (Map<String, String> map1, Map<String, String> map2){

        Map<String, List<Object>> joinedMap = new HashMap<>();


        for (String key : map1.keySet()) {
        List<Object> newValues = new ArrayList<>();
            if (map2.containsKey(key)) {
                joinedMap.put(key, newValues);

            newValues.add(map1.get(key));
                System.out.println("map 1 value = " + map1.get(key));
            newValues.add(map2.get(key));
                System.out.println("map 2 value = " + map2.get(key));
            }
        }
        System.out.println(joinedMap);
        return joinedMap;
    }
}
