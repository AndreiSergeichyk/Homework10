package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "one two three four five one One three five five";

        System.out.println(getMapRepetitions(text));
    }

    private static Map getMapRepetitions(String text) {
        Map<String, Integer> map = new HashMap<>();

        for (String value : text.split(" ")) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        return map;
    }
}