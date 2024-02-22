package Zadachi;

import java.util.HashMap;

public class Masiv_HMap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "banana", "banana",};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()){
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }

    }

}
