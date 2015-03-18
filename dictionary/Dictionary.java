package com.veinik.dictionary;

import java.util.HashMap;
import java.util.Map;


public class Dictionary {

    private String findword;      // for find

    private HashMap<String, String> map;

    public Dictionary(String word1, String word2) {

        map = new HashMap<String, String>();
    }

    void addWord(String word1, String word2) {
        map.put(word1, word2);
    }

    void delWord(String word) {
        map.remove(word);
    }

    String findWordDe(String findWord) {
//        String antwort = "word not found";
        if (map.containsKey(findWord)) {
            return map.get(findWord);
        }
        return null;
    }

    String findWordRu(String findWord) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(findWord)) {
                return pair.getKey();
            }
        }
        return null;
    }
}

