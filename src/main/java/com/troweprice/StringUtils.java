package com.troweprice;

import java.util.Arrays;
import java.util.Comparator;

public class StringUtils {

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static String removePunctuationsAndExtraSpaces(String str){
        return str.trim().replaceAll("[,.;]", "").replaceAll("\\s+", " ");
    }

    public static String findLongestWordAndWordLength(String sentence) {
        if (isNullOrEmpty(sentence)) {
            throw new IllegalArgumentException("Invalid Input - input sentence should not be null or empty");
        }
        final String longestWord = Arrays.stream(removePunctuationsAndExtraSpaces(sentence).split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException(String.format("Error while processing, input sentence: %s", sentence)));

        return String.format("%s and %d", longestWord, longestWord.length());
    }

    public static String findShortestWordAndWordLength(String sentence) {
        if (isNullOrEmpty(sentence)) {
            throw new IllegalArgumentException("Invalid Input - input sentence should not be null or empty");
        }
        final String shortestWord = Arrays.stream(removePunctuationsAndExtraSpaces(sentence).split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException(String.format("Error while processing, input sentence: %s", sentence)));

        return String.format("%s and %d", shortestWord, shortestWord.length());
    }

    public static void main(String[] args) {
        String str = "  this is   uneven spacing   sentence  ";
        System.out.println(removePunctuationsAndExtraSpaces(str));
    }

}
