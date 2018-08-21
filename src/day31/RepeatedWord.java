package day31;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public static String repeatedWord(String book) {
        Set<String> longStringSet = new HashSet<>();
        String[] bookWordArray = book.toLowerCase().split("\\W+");
        String repeat = "";

        for (int i = 0; i < bookWordArray.length; i++) {
            if (!longStringSet.contains(bookWordArray[i])) {
                repeat = bookWordArray[i];
                longStringSet.add(bookWordArray[i]);
            } else {
                repeat = bookWordArray[i];
                return repeat;
            }
        }
    return repeat;
    }
}
