package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 10;

        // changed expected to 10 from 12. sum of all not including n is 10 and not 12.

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer input = 5;
        Integer expected = 24;
        // changed expected to 24 because it says "not including n"
        // if it included n then it would be 120;

        // : When
        Integer actual = IntegerUtils.getProductOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
