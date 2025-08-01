# Scrabble Word Validator 

A Java tool to check if a word can be formed from given letters (like Scrabble tiles) using frequency counting with HashMaps.

## Features
- Validates words against available letters.
- Case-insensitive checking.
- Efficient O(n) time complexity.

## Usage
```java
boolean isValid = ScrabbleValidator.validate("listen", "silent"); // true
