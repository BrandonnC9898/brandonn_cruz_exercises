package com.brandonn.test;

import com.brandonn.logic.ChainBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainBOTests {

    @Test
    @DisplayName("Should return lowercase string")
    public void lowerCase() {
        var bo = new ChainBO("HeLLo");
        assertEquals("hello", bo.toLowerCase());
    }

    @Test
    @DisplayName("Should return empty string")
    public void lowerCaseEmpty() {
        var bo = new ChainBO("");
        assertEquals("", bo.toLowerCase());
    }

    @Test
    @DisplayName("Should return uppercase string")
    public void upperCase() {
        var bo = new ChainBO("HeLLo");
        assertEquals("HELLO", bo.toUpperCase());
    }

    @Test
    @DisplayName("Should return empty string")
    public void upperCaseEmpty() {
        var bo = new ChainBO("");
        assertEquals("", bo.toUpperCase());
    }

    @Test
    @DisplayName("Should return the first two characters of string")
    public void getTwoFirstCharacters() {
        var bo = new ChainBO("hello");
        assertArrayEquals(new char[]{'h', 'e'}, bo.getFirstTwoCharacters());
    }

    @Test
    @DisplayName("Should return the first two characters of empty string")
    public void getTwoFirstCharactersOfEmpty() {
        var bo = new ChainBO("");
        assertArrayEquals(new char[]{}, bo.getFirstTwoCharacters());
    }

    @Test
    @DisplayName("Should return the first character of string")
    public void getFirstCharacter() {
        var bo = new ChainBO("h");
        assertArrayEquals(new char[]{'h'}, bo.getFirstTwoCharacters());
    }

    @Test
    @DisplayName("Should return the last two characters of string")
    public void getTwoLastCharacters() {
        var bo = new ChainBO("hello");
        assertArrayEquals(new char[]{'l', 'o'}, bo.getLastTwoCharacters());
    }

    @Test
    @DisplayName("Should return the last two characters of empty string")
    public void getTwoLastCharactersOfEmpty() {
        var bo = new ChainBO("");
        assertArrayEquals(new char[]{}, bo.getLastTwoCharacters());
    }

    @Test
    @DisplayName("Should return the occurrences of the last character in string")
    public void getOccurrencesOfLastCharInString() {
        var bo = new ChainBO("hello");
        assertEquals(1, bo.getOccurrencesOfLastCharInString());
    }

    @Test
    @DisplayName("Should return the occurrences of the last character in string")
    public void getOccurrencesOfLastCharRepeatedInString() {
        var bo = new ChainBO("Java");
        assertEquals(2, bo.getOccurrencesOfLastCharInString());
    }

    @Test
    @DisplayName("Should return the occurrences of the last character for only upper or lower case")
    public void getOccurrencesOfLastCharInLowerCaseInString() {
        var bo = new ChainBO("JAva");
        assertEquals(1, bo.getOccurrencesOfLastCharInString());
    }

    @Test
    @DisplayName("Should return 0 occurrences for empty string")
    public void getOccurrencesOfLastCharInStringOfEmpty() {
        var bo = new ChainBO("");
        assertEquals(0, bo.getOccurrencesOfLastCharInString());
    }

    @Test
    @DisplayName("Should return concat asterisks at the beginning and the end")
    public void concatAsterisks() {
        var bo = new ChainBO("hello");
        assertEquals("***hello***", bo.concatAsterisk());
    }

    @Test
    @DisplayName("Should return concat asterisks to empty string")
    public void concatAsterisksToEmpty() {
        var bo = new ChainBO("");
        assertEquals("******", bo.concatAsterisk());
    }

    @Test
    @DisplayName("Should return reversed string")
    public void reverse() {
        var bo = new ChainBO("hello");
        assertEquals("olleh", bo.reverseString());
    }

    @Test
    @DisplayName("Should return empty for reversed empty string")
    public void reverseEmpty() {
        var bo = new ChainBO("");
        assertEquals("", bo.reverseString());
    }
}
