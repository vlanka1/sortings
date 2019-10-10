package com.asu.svvt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {


    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void sort_EmptyArrayPositive() {
        int[] nums = {};

        selectionSort.sort(nums);

        assertEquals(nums.length, 0);
    }

    @Test
    public void sort_singleValuePositive() { // to test the sort method for single value
        int[] values = {10};

        selectionSort.sort(values);

        assertArrayEquals(new int[] {10}, values);
    }

    @Test
    public void sort_singleValueNegative() { // to test the sort method for single value with negative result
        int[] values = {10};

        selectionSort.sort(values);

        int[] expected = {20};

        assertNotEquals(expected[0], values[0]);
    }

    @Test
    public void sort_singleValueDiffLengthNegative() { // to test the sort method for single value with negative result
        int[] values = {10};

        selectionSort.sort(values);

        int[] expected ={10, 20};

        assertNotEquals(expected.length, values.length);
    }

    @Test
    public void sort_MultipleValuesNegative() { // to test the sort method for negative results with multiple values
        int[] nums = { 3,6,1,8,9,4};
        int[] expected =  {3,6,1,8,9,4};

        selectionSort.sort(nums);

        //assertArrayEquals(expected, nums);
        assertFalse(nums[0] == expected[0]);
    }

    @Test
    public void sort_MultipleValuesPositive() { // to test the sort method with multiple values
        int[] nums = { 3,6,1,8,9,4};
        int[] expected =  {1,3,4,6,8,9};

        selectionSort.sort(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void sort_MultipleValues2Positive() { // to test the sort method with multiple values for negative numbers
        int[] nums = { -3,-1,-2,0};
        int[] expected =  {-3,-2,-1,0};

        selectionSort.sort(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void sort_MultipleValues2Negative() { // to test the sort method for negative results with different lengths
        int[] nums = { 3,6,1,8,9,4};
        int[] expected =  {1,3,4,6,8,9,10};

        selectionSort.sort(nums);

        //assertArrayEquals(expected, nums);
        assertNotEquals(expected.length, nums.length);
    }

}