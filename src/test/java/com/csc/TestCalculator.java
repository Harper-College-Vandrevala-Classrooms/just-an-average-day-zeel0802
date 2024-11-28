package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    void testMaximumFunctions() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, calculator.maximumUsingForLoop(nums));
        assertEquals(5, calculator.maximumUsingStream(nums));
    }

    @Test
    void testMinimumFunctions() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, calculator.minimumUsingForLoop(nums));
        assertEquals(1, calculator.minimumUsingStream(nums));
    }

    @Test
    void testSumFunctions() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, calculator.sumUsingForLoop(nums));
        assertEquals(15, calculator.sumUsingStream(nums));
    }

    @Test
    void testAverageFunctions() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(3.0, calculator.averageUsingForLoop(nums));
        assertEquals(3.0, calculator.averageUsingStream(nums));
    }

    @Test
    void testEvensOnly() {
        int[] nums = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{2, 4}, calculator.evensOnly(nums));
    }

    @Test
    void testOddsOnly() {
        int[] nums = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 3, 5}, calculator.oddsOnly(nums));
    }

    @Test
    void testAddFive() {
        int[] nums = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{6, 7, 8, 9, 10}, calculator.addFive(nums));
    }

    @Test
    void testSquareNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, calculator.squareNumbers(nums));
    }
}
