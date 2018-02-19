package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firstWord = stringArray[0];

        return firstWord;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        String secondWord = stringArray[1];
        return secondWord;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {

        String lastWord = stringArray[stringArray.length - 1];
        return lastWord;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        String secondLastWord = stringArray[stringArray.length - 2];
        return secondLastWord;
    }
}
