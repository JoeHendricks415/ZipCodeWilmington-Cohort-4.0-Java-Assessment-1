package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sumOfIntArray = 0;

        for (int numbers : intArray){
            sumOfIntArray += numbers;
        }
        return sumOfIntArray;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        int sumOfIntArray = 1;

        for (int numbers : intArray){
            sumOfIntArray *= numbers;
        }
        return sumOfIntArray;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        int sumOfIntArray = 0;

        for (int numbers : intArray){
            sumOfIntArray += numbers;
        }

        double average = sumOfIntArray / intArray.length;

        return average;

    }
}
