package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        int counter = 0;
        int remove = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                counter++;
            }
        }

        Integer[] deleteEvensArray = new Integer[ints.length - counter];

        for (int j = 0; j < ints.length; j++){
            if (ints[j] % 2 == 1){
                deleteEvensArray[remove] = ints[j];
                remove++;
            }
        }

        return deleteEvensArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        int counter = 0;
        int remove = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                counter++;
            }
        }

        Integer[] deleteOddsArray = new Integer[ints.length - counter];

        for (int j = 0; j < ints.length; j++){
            if (ints[j] % 2 == 0){
                deleteOddsArray[remove] = ints[j];
                remove++;
            }
        }

        return deleteOddsArray;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int counter = 0;
        int remove = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 1) {
                counter++;
            }
        }

        Integer[] deleteMultiplesofThreeArray = new Integer[ints.length - counter];

        for (int j = 0; j < ints.length; j++){
            if (ints[j] % 3 == 1){
                deleteMultiplesofThreeArray[remove] = ints[j];
                remove++;
            }
        }

        return deleteMultiplesofThreeArray;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        int counter = 0;
        int remove = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                counter++;
            }
        }

        Integer[] deleteMultiplesOfN = new Integer[ints.length - counter];

        for (int j = 0; j < ints.length; j++){
            if (ints[j] % multiple != 0){
                deleteMultiplesOfN[remove] = ints[j];
                remove++;
            }
        }

        return deleteMultiplesOfN;

    }
}
