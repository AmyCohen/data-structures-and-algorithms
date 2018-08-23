package day33;

import java.util.Arrays;
import java.util.Map;

public class LeftJoin {

    public static String leftJoin (Map<String, String> map1, Map<String, String> map2){
        int count = 0;
        String[] row = new String[3];
        MyMap<String, String, String> joinedMap = new MyMap<>();

        for (Object key : map1.keySet()){
            System.out.println("Key = " + key);

            if (map2.containsKey(key)) {
                System.out.println("Key " + key.toString().toUpperCase() + " was contained in Map 2");
                count++;
        String[][] rowSet = new String[count][row.length];
                row[0] = key.toString();
                row[1] = map1.get(key);
                row[2] = map2.get(key);
                System.out.println("count = " + count);
                rowSet[count-1] = row;
                System.out.println(Arrays.toString(row));
                    System.out.println(Arrays.deepToString(rowSet));
            }
        }
//        for (Object key : map1.keySet()){
//            System.out.println("Key = " + key);
//
//            if (map2.containsKey(key)) {
//                count++;

//            }
//        }





        return Arrays.toString(row);
    }
}
