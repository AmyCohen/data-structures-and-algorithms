package day33;

import java.util.Map;

public class LeftJoin {

    public static String leftJoin (Map<String, String> map1, Map<String, String> map2){

        MyMap<String, String, String> joinedMap = new MyMap<>();
        for (String key : map1.keySet()){

            if (map2.containsKey(key)){
                joinedMap.put(key, map1.values().toString(), map2.values().toString());
            }
        }

        return "";
    }
}
