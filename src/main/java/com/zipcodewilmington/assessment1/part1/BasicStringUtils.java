package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String camelStr = str.substring(0, 1).toUpperCase() + str.substring(1);

        return camelStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseStr = new StringBuilder(str);

        reverseStr.reverse();

        return reverseStr.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder reverseStr = new StringBuilder(str);

        reverseStr.reverse();
        reverseStr.toString();

        String reverseThenCamel = reverseStr.substring(0, 1).toUpperCase() + reverseStr.substring(1);

        return reverseThenCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String removeFirstLastChar = str.substring(1, str.length() -1);
        return removeFirstLastChar;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String invertChars = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isUpperCase(character)) {
                invertChars += Character.toLowerCase(character);
            }
            else if (Character.isLowerCase(character)) {
                invertChars += Character.toUpperCase(character);
            } else if (str.charAt(i) == ' '){
                invertChars += " ";
            }
        }


        return invertChars;
    }
}
