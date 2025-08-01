package models;

import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    private final Map<Character, Integer> frequencyMap;

    public LetterFrequency(String word) {
        frequencyMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
    }

    public boolean canForm(LetterFrequency other) {
        for (Map.Entry<Character, Integer> entry : other.frequencyMap.entrySet()) {
            if (this.frequencyMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}