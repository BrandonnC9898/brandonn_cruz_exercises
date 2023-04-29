package com.brandonn.logic;

import java.util.Arrays;

public class ChainBO {
    private String string;

    public ChainBO(String string) {
        this.string = string;
    }

    public void printAllMethodsFacade() {
        System.out.println("Lower case: " + this.toLowerCase());
        System.out.println("Upper case: " + this.toUpperCase());
        System.out.println("First two characters: " + Arrays.toString(this.getFirstTwoCharacters()));
        System.out.println("Last two characters: " + Arrays.toString(this.getLastTwoCharacters()));
        System.out.println("Occurrences of last character: " + this.getOccurrencesOfLastCharInString());
        System.out.println("Concat asterisks: " + this.concatAsterisk());
        System.out.println("Reverse string: " + this.reverseString());
    }

    public String toLowerCase() {
        return this.string.toLowerCase();
    }

    public String toUpperCase() {
        return this.string.toUpperCase();
    }

    public char[] getFirstTwoCharacters() {
        int maxLength = this.string.length() >= 2 ? 2 : this.string.length();
        char[] response = new char[maxLength];
        for (int i = 0; i < response.length; i++) {
            response[i] = this.string.charAt(i);
        }
        return response;
    }

    public char[] getLastTwoCharacters() {
        int maxLength = this.string.length() >= 2 ? 2 : this.string.length();
        int strLength = this.string.length();
        char[] response = new char[maxLength];
        for (int i = 0; i < response.length; i++) {
            response[i] = this.string.charAt(strLength - maxLength + i);
        }
        return response;
    }

    public long getOccurrencesOfLastCharInString() {
        if (this.string.length() > 0) {
            char lastChar = this.string.charAt(this.string.length() - 1);
            return this.string.chars().filter(c -> c == lastChar).count();
        }
        return 0;
    }

    public String concatAsterisk() {
        return "***" + this.string + "***";
    }

    public String reverseString() {
        String reversedStr = "";
        for (int i = this.string.length() - 1; i >= 0; i--) {
            reversedStr += this.string.charAt(i);
        }
        return reversedStr;
    }
}
