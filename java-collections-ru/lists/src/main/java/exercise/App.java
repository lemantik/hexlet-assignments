package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String setOfChars, String word) {
        ArrayList<Character> sourceList = new ArrayList<Character>();
        System.out.println(setOfChars);
        for (int i = 0; i < setOfChars.length(); i += 1) {
            sourceList.add(Character.toLowerCase(setOfChars.charAt(i)));
        }
        for (int j = 0; j < word.length(); j += 1) {
            char symbol = Character.toLowerCase(word.charAt(j));
            System.out.println(symbol);
            if (sourceList.contains(symbol)) {
                sourceList.remove(sourceList.indexOf(symbol));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
