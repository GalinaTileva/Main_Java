package Zadachi.Masivi;

import java.util.HashMap;

public class Masiv_HMap {
    public static void main(String[] args) {

        String[] array = {"pear", "peach", "peach", "pear", "pear", "pear"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : array) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : map.keySet()){
            int count = map.get(word);
            System.out.println(word + ": " + count);
        }

    }

}
