package day33;

import java.util.Arrays;
import java.util.Map;

public class LeftJoin {

    public static String leftJoin (Map<String, String> map1, Map<String, String> map2){

        String[] row = new String[3];
        String[][] rowSet = new String[1][row.length];
        MyMap<String, String, String> joinedMap = new MyMap<>();
        System.out.println("keyset = " + map1.keySet());
        for (String key : map1.keySet()){

            if (map2.containsKey(key)){
                for (int i = 0; i < map1.size()-1; i++) {
                    row[0] = key;
                    row[1] = map1.get(key);
                    row[2] = map2.get(key);
                    rowSet[i] = row;
                    System.out.println(Arrays.deepToString(rowSet));
                }
            }
        }

        return "";
    }
}
