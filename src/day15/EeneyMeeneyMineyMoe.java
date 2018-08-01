package day15;

import java.util.*;

public class EeneyMeeneyMineyMoe extends LinkedList {

    public static String eeneyMeeneyMineyMoe(LinkedList<String> listOfNames, int n){
        int count = 0;
        String it;

        while(listOfNames.size() > 1) {
            it = listOfNames.poll();
            count++;

            if(count % n != 0) {
                listOfNames.add(it);
            }
        }

        return listOfNames.toString();
    }
}
