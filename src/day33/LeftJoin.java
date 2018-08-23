package day33;

import java.util.Arrays;
import java.util.Map;

public class LeftJoin {

    public static String leftJoin (Map<String, String> map1, Map<String, String> map2){
        int arrayCount = 0;
        int count = 0;
        String[] row = new String[3];
        String[] insertRow = new String[3];
        MyMap<String, String, String> joinedMap = new MyMap<>();

        for (Object key : map1.keySet()){
            System.out.println("Key = " + key);

            if (map2.containsKey(key)) {
                arrayCount++;
            }
            }

        String[][] rowSet = new String[arrayCount][3];

        for (Object key : map1.keySet()){
            System.out.println("Key = " + key);

            if (map2.containsKey(key)) {
                System.out.println("Key " + key.toString().toUpperCase() + " was contained in Map 2");
                count++;
                row[0] = key.toString();
                row[1] = map1.get(key);
                row[2] = map2.get(key);
                System.out.println("count = " + count);
                insertRow = row;
                rowSet[count-1] = insertRow;
                System.out.println(Arrays.deepToString(rowSet));
                }
            }

        return Arrays.deepToString(rowSet);
    }
}
