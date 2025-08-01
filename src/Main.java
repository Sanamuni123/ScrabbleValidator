import services.ScrabbleValidator;

public class Main {
    public static void main(String[] args) {
        String availableLetters = "listen";
        String wordToCheck = "silent";

        boolean isValid = ScrabbleValidator.validate(availableLetters, wordToCheck);
        System.out.println("Can form '" + wordToCheck + "' from '" + availableLetters + "': " + isValid);

    }
}