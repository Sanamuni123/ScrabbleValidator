package services;

import models.LetterFrequency;

public class ScrabbleValidator {
    public static boolean validate(String letters, String word) {
        LetterFrequency lettersFrequency = new LetterFrequency(letters.toLowerCase());
        LetterFrequency wordFrequency = new LetterFrequency(word.toLowerCase());
        return lettersFrequency.canForm(wordFrequency);
    }
}