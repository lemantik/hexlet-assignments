package exercise;


import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

// BEGIN
class App {
    public static void main(String[] args) {
        Map wordsHas = getWordCount("");
        System.out.println(toString(wordsHas));
    }
    public static final Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordsHashMap = new HashMap<>();
        if (text.isEmpty()) {
            return wordsHashMap;
        }
        String[] words = text.split(" ");
//        Map<String, Integer> wordsHashMap = new HashMap<>();

        for (int i = 0; i < words.length; i += 1) {
            if (!wordsHashMap.containsKey(words[i])) {
                wordsHashMap.put(words[i], 1);
            } else {
                int count = wordsHashMap.get(words[i]);
                wordsHashMap.put(words[i], count + 1);
            }
        }
        return wordsHashMap;
    };

    public static final String toString(Map map) {
        if (map.isEmpty()) {
            return "{}";
        }

        StringJoiner resultString = new StringJoiner("");
        resultString.add("{\n");

        for (Object i: map.keySet()) {
            resultString.add("  " + i + ": " + map.get(i) + "\n");
        }

        resultString.add("}");
        return resultString.toString();
    }
}
//END
